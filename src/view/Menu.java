package view;

import control.Buscador;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private String cep;
    private String saida = "";

    public String coletorCEP() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o CEP que deseja buscar: ");
        cep = leitor.nextLine();
        return cep;
    }
}

