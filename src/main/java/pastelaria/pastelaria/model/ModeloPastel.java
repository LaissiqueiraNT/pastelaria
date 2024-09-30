package pastelaria.pastelaria.model;

public class ModeloPastel {
    private Long id; 
    private String tamanho;
    private String sabor;
    private double valor;


    public ModeloPastel(String tamanho, String sabor, double valor) {
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.valor = valor;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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

