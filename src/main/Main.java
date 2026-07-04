package main;

import control.Buscador;
import control.HistoricoEnderecos;
import model.Endereco;
import view.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Buscador buscador = new Buscador();
        HistoricoEnderecos historico = new HistoricoEnderecos();

        Endereco endereco = buscador.buscarCEP();
        historico.guardarHistorico(endereco);

        Scanner leitor = new Scanner(System.in);
        String saida = "";

        while (!saida.equalsIgnoreCase("sair")) {
            System.out.println("Deseja continuar? (Digite SIM para continuar e SAIR para encerrar)");
            saida = leitor.nextLine();

            if (saida.equalsIgnoreCase("sim")) {
                endereco = buscador.buscarCEP();
                historico.guardarHistorico(endereco);
            } else {
                break;
            }
        }
        historico.guardarJSON();
        System.out.println("Programa Encerrado!");
    }
}
