package Aula05;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numeroCliente, String nome){
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }

    public int getNumeroCliente(){
        return this.numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getDivida() {
        return this.divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String aumentarDivida(double valor){
        this.divida = divida + valor;
        return "Sua divida aumentou: " + this.divida;

    }

    public String pagarDivida(){
        this.divida = 0;
        return "VocÃª pagou sua divida";
    }
}
