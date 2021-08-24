package AulaIntegradora06;

import java.time.LocalDate;

public class DogAdocao {

    private String nome;
    private String raca;
    private double peso;
    private LocalDate anoNasc;
    private boolean possuiChip;
    private boolean estaFerido;

    DogAdocao(String nome, String raca, double peso, LocalDate anoNasc){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.anoNasc = anoNasc;
    }

    DogAdocao(boolean possuiChip, boolean estaFerido){
        this.estaFerido = estaFerido;
        this.possuiChip = possuiChip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(LocalDate anoNasc) {
        this.anoNasc = anoNasc;
    }

    public boolean isPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    // Metodos
    public boolean temChip(){
        return this.possuiChip;
    }

    public String aptoAdocao(){
        if (peso > 5 && !estaFerido){
            return "Pode ser adotado";
        }else{
            return "NÃ£o pode ser adotado";
        }
    }

}