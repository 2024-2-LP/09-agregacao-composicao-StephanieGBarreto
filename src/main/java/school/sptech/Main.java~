package school.sptech;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", LocalDate.of(1954, 7, 29));
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", LocalDate.of(1997, 6, 26));

        Avaliacao avaliacao1 = new Avaliacao("Excelente livro!", 5.0);
        Avaliacao avaliacao2 = new Avaliacao("Muito bom, mas um pouco longo.", 4.0);

        livro1.adicionarAvaliacao(avaliacao1);
        livro2.adicionarAvaliacao(avaliacao2);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("Harry Potter");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo() + ", Autor: " + livroEncontrado.getAutor() + ", Data de Publicação: " + livroEncontrado.getDataPublicacao());
        } else {
            System.out.println("Livro não encontrado.");
        }

        if (livroEncontrado != null) {
            for (Avaliacao avaliacao : livroEncontrado.getAvaliacoes()) {
                System.out.println("Avaliação: " + avaliacao.getQtdEstrelas() + " estrelas, Comentário: " + avaliacao.getDescricao());
            }
        }
    }
}
