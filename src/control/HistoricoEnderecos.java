package control;

import model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class HistoricoEnderecos {

    List<Endereco> historico = new ArrayList<>();
    Endereco endereco;

    public void guardarHistorico() {
        historico.add(endereco);

    }
}
