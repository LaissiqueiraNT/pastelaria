package pastelaria.pastelaria.model;

import java.util.Date;

public class Ingrediente {
    private long id;
    private String nome;
    private Date dataValidade;
    private String marca;
    private String observacao;

    public Ingrediente(String nome, Date dataValidade,String marca, String observacao){
        
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.marca = marca;
        this.observacao = observacao;
    }
    

    public Ingrediente() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}


