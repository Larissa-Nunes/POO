package Aula06;

import java.time.LocalDate;

public class Impressora {

    private String modelo;
    private String tipoConecao;
    private LocalDate dataFabricacao;
    private  int folhasDisponives;

    public Impressora(String modelo, String tipoConecao, LocalDate dataFabricacao) {
        this.modelo = modelo;
        this.tipoConecao = tipoConecao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponives = 0;
    }

    public boolean temPapel(){
        if (folhasDisponives >0){
            return true;
        }else {
            return false;
        }
    }

    public void imprimir(String texto) {
        if (temPapel()) {
            this.folhasDisponives--;
            System.out.println(texto);
        }else {
            System.out.println("Não Tem Papel");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConecao() {
        return tipoConecao;
    }

    public void setTipoConecao(String tipoConecao) {
        this.tipoConecao = tipoConecao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponives() {
        return folhasDisponives;
    }

    public void setFolhasDisponives(int folhasDisponives) {
        this.folhasDisponives = folhasDisponives;
    }


}
