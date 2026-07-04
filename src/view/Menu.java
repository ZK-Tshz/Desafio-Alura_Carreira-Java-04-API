package view;

import java.util.Scanner;

public class Menu {

    private String cep;

    public String coletorCEP() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o CEP que deseja buscar: ");
        cep = leitor.nextLine();
        return cep;
    }
}

