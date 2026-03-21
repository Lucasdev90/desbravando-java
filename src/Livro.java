public abstract class Livro implements Produto{

    String nome;
    String descricao;
    double valor;
    String isbn;
    private Autor autor;
    private boolean impresso;



         public Livro (Autor autor){
             this.autor = autor;
             this.isbn = "000-00-00000-00-0";
             this.impresso = true;
        }

         public Livro (){

        }

        void mostrarDetalhes(){
            String mensagem = "Mostrando detalhes do livro";
            System.out.println(mensagem);
            System.out.println(nome);
            System.out.println(descricao);
            System.out.println("Valor: " + valor);
            System.out.println("ISBN : " + isbn);

            if(this.temAutor()){
                autor.mostrarDetalhes();
            }

            System.out.println("---");
        }



        public double getValor(){
            return valor;
        }


        public void  setValor (double valor){
           this.valor = valor;

        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setDescricao(String descricao){
            this.descricao = descricao;
        }

        public String getIsbn(){
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public Autor getAutor(){
            return autor;
        }

        public void setAutor(Autor autor){
            this.autor = autor;
        }



        public abstract boolean aplicaDescontoDe(double porcentagem);



        boolean temAutor(){
            boolean naoEhnull = this.autor != null;
            return naoEhnull;

        }


    }


