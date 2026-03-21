public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    // getters e setters

    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }


    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.1){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

}
