package main;

import control.Buscador;
import view.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Buscador buscador = new Buscador();
        Scanner leitor = new Scanner(System.in);
        String saida = "";

        buscador.buscarCEP();

        while (!saida.equalsIgnoreCase("sair")) {
            System.out.println("Deseja continuar? (Digite SIM para continuar e SAIR para encerrar)");
            saida = leitor.nextLine();

            if (saida.equalsIgnoreCase("sim")) {
                buscador.buscarCEP();
            } else {
                break;
            }
        }
        System.out.println("Programa Encerrado!");
    }
}
