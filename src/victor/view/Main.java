package victor.view;

import control.ConsultaCEP;
import models.Endereco;

public class Main {
    public static void main(String[] args) {
        ConsultaCEP consultaCEP = new ConsultaCEP();
        Endereco novoEndereço = consultaCEP.buscaEndereco("01001000");

        System.out.println(novoEndereço);
    }
}
