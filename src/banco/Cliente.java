package banco;

import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
    private int cod;
    private String nome;
    private String endereco;

    public Cliente(int cod, String nome, String endereco) {
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String[] getArrayStringCliente(){
        return new String[] {String.valueOf(this.cod), this.nome, this.endereco};   
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nCod: " + this.getCod() + "\nNome: " + this.getNome();
    }
    
    
}