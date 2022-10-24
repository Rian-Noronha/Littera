package com.rntec.littera.model;

import java.util.List;

public class Autor {

    private String descricao;
    private List<String> obras;

    public Autor(String descricao, List<String> obra){
        this.descricao = descricao;
        this.obras = obras;
    }

    public Autor(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getObras() {
        return obras;
    }

    public void setObras(List<String> obras) {
        this.obras = obras;
    }
}
