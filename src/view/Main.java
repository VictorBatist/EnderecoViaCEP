package view;

import control.ConsultaCEP;
import models.Endereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Informe o CEP de sua cidade: 
                """);

        String buscaCEP = scanner.nextLine();

        ConsultaCEP consultaCEP = new ConsultaCEP();
        Endereco novoEndereco = consultaCEP.buscaEndereco(buscaCEP);

        System.out.println(novoEndereco);
    }
}
