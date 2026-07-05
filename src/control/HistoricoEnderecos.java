package control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Endereco;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoricoEnderecos {

    private final List<Endereco> historico = new ArrayList<>();

    public void guardarHistorico(Endereco endereco) {
        historico.add(endereco);
    }

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void guardarJSON() throws IOException {
        FileWriter escrita = new FileWriter("enderecos.json");
        escrita.write(gson.toJson(historico));
        escrita.close();
    }
}
