package br.com.exercicioarraylistmotolpo;

public class Moto {
    String nome;
    String cor;
    double valor;

    public Moto ()  {

    }
    public Moto(String nome, String cor, double valor) {
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
