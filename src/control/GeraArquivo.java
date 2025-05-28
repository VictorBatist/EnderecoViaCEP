package control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Endereco;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {
    public void salvaJSON(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWrite = new FileWriter(endereco.cep() + ".json");
        fileWrite.write(gson.toJson(endereco));
        fileWrite.close();
    }
}
