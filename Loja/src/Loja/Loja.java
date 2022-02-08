package Loja;

import java.util.List;
import java.util.function.Consumer;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

//    Methods
    public void listaLivros() {
        if(livros.size() == 0) {
            System.out.println("A loja não tem livros no seu estoque");
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("A loja Americanas, possui estes livros para venda: ");
            for(int i = 0; i < livros.size(); i++) {
                System.out.println("Titulo: " + livros.get(i).getNome() + " Preco: " + livros.get(i).getPreco() + " Quantidade: " + livros.get(i).getQtd() + " em estoque");
            }
        }
    }

    public void listaVideoGames() {
        if(videoGames.size() == 0) {
            System.out.println("A loja não tem livros no seu estoque");
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("A loja Americanas, possui estes video-games para venda: ");
            for(int i = 0; i < videoGames.size(); i++) {
                System.out.println("Titulo: " + videoGames.get(i).getNome() + " Preco: " + videoGames.get(i).getPreco() + " Quantidade: " + videoGames.get(i).getQtd() + " em estoque");
            }
        }
    }

    public double calculaPatrimonio() {
        return 0;
    }
}
