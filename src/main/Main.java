package main;

import control.Buscador;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Buscador buscador = new Buscador();
        buscador.buscarCEP();
    }
}
