public class CarrinhoDeCompras {

    private double total = 0.0;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);

        livro.aplicaDescontoDe(0.16);
        total += livro.getValor();
    }


     public void adiciona(Revista revista){
         System.out.println("Adicionando " + revista);
         revista.aplicaDescontoDe(0.05);
         total += revista.getValor();
     }
     public double getTotal(){
        return total;
     }
}



