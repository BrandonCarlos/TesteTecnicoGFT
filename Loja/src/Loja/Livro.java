package Loja;

public class Livro extends Produto implements Imposto{
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro(String autor, String tema, int qtdPag) {
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

//    Getter's and setter's
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

//    Implementando a interface
    @Override
    public double calculaImposto() {
        if(this.tema == "educativo") {
            System.out.println("Livro educativo não tem imposto: " + this.getNome());
        } else {
            return 0.10;
        }


        return 0.010;
    }
}
