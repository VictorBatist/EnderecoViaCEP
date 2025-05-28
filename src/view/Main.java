package view;

import control.ConsultaCEP;
import control.GeraArquivo;
import models.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Informe o CEP de sua cidade: 
                """);

        String cep = scanner.nextLine();

        ConsultaCEP consultaCEP = new ConsultaCEP();

        try {
            Endereco novoEndereco = consultaCEP.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeraArquivo geraArquivo = new GeraArquivo();
            geraArquivo.salvaJSON(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
