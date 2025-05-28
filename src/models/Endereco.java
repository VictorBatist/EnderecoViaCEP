package models;

public record Endereco(String cep, String logradouro, String complemento, String localidade, String uf) {

    @Override
    public String toString() {
        return "cep: " + this.cep + "\n" +
                "logradouro: " + this.logradouro + "\n" +
                "complemento: " + this.complemento + "\n" +
                "localidade: " + this.localidade + "\n" +
                "uf: " + this.uf + "\n" ;
    }
}
