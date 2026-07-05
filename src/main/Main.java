package main;

import control.Buscador;
import control.HistoricoEnderecos;
import model.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Buscador buscador = new Buscador();
        HistoricoEnderecos historico = new HistoricoEnderecos();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o CEP que deseja buscar: ");
        String cep = leitor.nextLine();

        Endereco endereco = buscador.buscarCEP(cep);
        historico.guardarHistorico(endereco);

        String saida = "";

        while (!saida.equalsIgnoreCase("sair")) {
            System.out.println("Deseja continuar? (Digite SIM para continuar e SAIR para encerrar)");
            saida = leitor.nextLine();

            if (saida.equalsIgnoreCase("sim")) {

                System.out.println("Digite o CEP que deseja buscar: ");
                cep = leitor.nextLine();

                endereco = buscador.buscarCEP(cep);
                historico.guardarHistorico(endereco);

            } else {
                break;
            }
        }
        historico.guardarJSON();
        System.out.println("Programa Encerrado!");
    }
}
