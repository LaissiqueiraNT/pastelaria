package pastelaria.pastelaria.model;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Ingrediente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIngrediente")
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private Date dataValidade;

    @Column(columnDefinition = "TEXT")
    private String observacao;

    @ManyToMany(mappedBy = "ingredientes")
    @JsonBackReference
    private List<Pastel> pasteis;

    public List<Pastel> getPasteis() {
        return pasteis;
    }

    public void setPasteis(List<Pastel> pasteis) {
        this.pasteis = pasteis;
    }

    public Ingrediente(String nome, Date dataValidade,String marca, String observacao){
        
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.marca = marca;
        this.observacao = observacao;
    }
    public Ingrediente() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
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


