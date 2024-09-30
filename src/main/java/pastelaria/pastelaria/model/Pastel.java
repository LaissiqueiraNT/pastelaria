package pastelaria.pastelaria.model;
import java.util.List;
import java.util.ArrayList;

import pastelaria.pastelaria.model.Enum.EtipoPastel;


public class Pastel {
    private Long id;
    private String nome;
    private List<ModeloPastel> modelos;
    private List<Ingrediente> ingredientes;
    private EtipoPastel tipo;
    private boolean ativa;
    private String observacao;
    
    public Pastel(String nome, EtipoPastel tipo, boolean ativa, String observacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.ativa = ativa;
        this.observacao = observacao;

        this.modelos = new ArrayList<ModeloPastel>();
        this.ingredientes = new ArrayList<Ingrediente>();
    }
    public Pastel(String nome, List<ModeloPastel> modelos, List<Ingrediente> ingredientes, EtipoPastel tipo,
            boolean ativa, String observacao) {
        this.nome = nome;
        this.modelos = modelos;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.ativa = ativa;
        this.observacao = observacao;
    }
    public Pastel() {
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


