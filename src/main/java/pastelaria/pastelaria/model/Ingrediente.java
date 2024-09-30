package pastelaria.pastelaria.model;

import java.util.Date;
import java.util.List;

import org.jakarta.persistence.Column;
import org.jakarta.persistence.Entity;
import org.jakarta.persistence.GeneratedValue;
import org.jakarta.persistence.GenerationType;

import org.jakarta.persistence.Id;
import org.jakarta.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonBackReference;

public class Ingrediente {
    private long id;
    private String nome;
    private Date dataValidade;
    private String marca;
    private String observacao;
    @Entity
    
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
    private List<Pastel> pastels;

    public List<Pastel> getPastels() {
        return pastels;
    }

    public void setPastels(List<Pastel> pastels) {
        this.pastels = pastels;
    }

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


