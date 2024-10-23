package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            if (livro.getTitulo() != null && !livro.getTitulo().isBlank()) {
                if (livro.getAutor() != null && !livro.getAutor().isBlank()) {
                    if (livro.getDataPublicacao() != null) {
                        livros.add(livro);
                    }
                }
            }
        }
    }

    public void removerLivroPorTitulo(String titulo){
        for (int i = 0; i < livros.size(); i++) {
            if (titulo.equalsIgnoreCase(livros.get(i).getTitulo())){
                livros.remove(i);
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){
        if(titulo != null && !titulo.isBlank()){
            for (Livro livroAtual : livros){
                if(livroAtual.getTitulo().equalsIgnoreCase(titulo)){
                    return livroAtual;
                }
            }
        }
        return null;
    }

    public Integer contarLivros(){
        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano) {
        List<Livro> livrosAteAno = new ArrayList<>();
        for (Livro livroAtual : livros) {
            if (livroAtual.getDataPublicacao().getYear() <= ano) {
                livrosAteAno.add(livroAtual);
            }
        }

        return livrosAteAno;
    }

}
