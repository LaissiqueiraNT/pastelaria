package pastelaria.pastelaria.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CupomDesconto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCupomDesconto")
    private Long id;

    @Column(nullable = false, unique = true)
    private String descricao;

    @Column(nullable = false)
    private double valor;

    @OneToMany(mappedBy = "cupomDesconto")
    private List<Pastel> pastels;

    public List<Pastel> getPastels() {
        return pastels;
    }
    public void setPastels(List<Pastel> pastels) {
        this.pastels = pastels;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
