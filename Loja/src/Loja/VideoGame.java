package Loja;

public class VideoGame extends Produto implements Imposto{

    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(String marca, String modelo, boolean isUsado) {
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

//    Getter's and Setter's
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

//    Implementação da interface
    @Override
    public double calculaImposto() {
        if (this.isUsado == true) {
            return 0.25;
        } else {
            return 0.45;
        }
    }
}
