package control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Endereco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscador {

    public Endereco buscarCEP(String cep) throws IOException, InterruptedException {

        String chave;
        Endereco endereco;

        chave = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(chave))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .create();

        endereco = gson.fromJson(json, Endereco.class);
        return endereco;
    }
}

