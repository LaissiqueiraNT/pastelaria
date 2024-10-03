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

    @Column(nullable = false, unique = true)
    private String sabor; 

    @ManyToMany(mappedBy = "modelos")
    @JsonBackReference
    private List<Pastel> pastels;

    public List<Pastel> getPastels() {
        return pastels;
    }

    public void setPastels(List<Pastel> pastels) {
        this.pastels = pastels;
    }
    public ModeloPastel(String tamanho, String sabor, double valor) {
        this.tamanho = tamanho;
        this.sabor = sabor;
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

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}

