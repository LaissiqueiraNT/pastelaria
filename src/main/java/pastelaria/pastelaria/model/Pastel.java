package pastelaria.pastelaria.model;
import java.util.List;
import java.util.ArrayList;

import pastelaria.pastelaria.model.Enum.EtipoPastel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Pastel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPastel")
    private long id;

    @Column(nullable = false, unique = true)
    private String nome; 

    @ManyToMany
    @JoinTable(
        name = "pastel_modelo",
        joinColumns = @JoinColumn(name = "idPastel"),
        inverseJoinColumns = @JoinColumn(name = "idModeloPastel")
    )
    private List<ModeloPastel> modelos; 
    
    @ManyToMany
    @JoinTable(
        name = "pastel_ingredientes",
        joinColumns = @JoinColumn(name = "idPastel"),
        inverseJoinColumns = @JoinColumn(name = "idIngrediente")
    )
    private List<Ingrediente> ingredientes;

    @Column(nullable = false)
    private EtipoPastel tipo;

    @Column(nullable = false)
    private boolean ativa;

    @Column(columnDefinition = "TEXT")
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "idCupomDesconto")
    private CupomDesconto cupomDesconto;

    public CupomDesconto getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(CupomDesconto cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    public Pastel(String nome, EtipoPastel tipo, boolean ativa, String observacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.ativa = ativa;
        this.observacao = observacao;
        this.modelos = new ArrayList<ModeloPastel>();
        this.ingredientes = new ArrayList<Ingrediente>();
    }
    public Pastel(String nome, List<ModeloPastel> modelos, List<Ingrediente> ingredientes, EtipoPastel tipo,boolean ativa, String observacao) {
        this.nome = nome;
        this.modelos = modelos;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.ativa = ativa;
        this.observacao = observacao;
    }
    public Pastel() {
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
    public List<ModeloPastel> getModelos() {
        return modelos;
    }
    public void setModelos(List<ModeloPastel> modelos) {
        this.modelos = modelos;
    }
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public EtipoPastel getTipo() {
        return tipo;
    }
    public void setTipo(EtipoPastel tipo) {
        this.tipo = tipo;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}


