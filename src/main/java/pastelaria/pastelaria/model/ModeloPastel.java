package pastelaria.pastelaria.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class ModeloPastel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIngrediente")
    private long id;

    @Column(nullable = false, unique = true)
    private String tamanho; 

    @Column(nullable = false)
    private double valor;

    @ManyToMany(mappedBy = "modelos")
    @JsonBackReference
    private List<Pastel> pasteis;

    public List<Pastel> getPasteis() {
        return pasteis;
    }

    public void setPasteis(List<Pastel> pasteis) {
        this.pasteis = pasteis;
    }
    public ModeloPastel(String tamanho, double valor) {
        this.tamanho = tamanho;
        this.valor = valor;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}

