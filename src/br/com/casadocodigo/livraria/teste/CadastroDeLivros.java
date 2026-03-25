package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo turini");
        autor.setEmail("rodrigo.turini@caelum.com,br");
        autor.setCpf( "123.456.789.10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);

        livro.mostrarDetalhes();


        Autor outroAutor = new Autor();
        outroAutor.setNome("Lucas Rafael");
        outroAutor.setEmail("Lucasweb90@gmail.com");
        outroAutor.setCpf("222-222-222-87");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Java 8 prático");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);

        outroLivro.mostrarDetalhes();

    }

}


