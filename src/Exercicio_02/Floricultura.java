package Exercicio_02;

public class Floricultura {
    private String nome;
    private int estoqueIdeal;
    private int estoqueAtual;

    public Floricultura(String nome, int estIdeal, int estAtual){
        this.nome = nome;
        this.estoqueIdeal = estIdeal;
        this.estoqueAtual = estAtual;
    }
    public int comprasDiarias(){
        if(estoqueAtual < estoqueIdeal){
            return estoqueAtual - estoqueIdeal;
        }
        return 0;
    }
    public String toString(){
        if(comprasDiarias() > 0){
            return "Quantidade a ser comprada: "+comprasDiarias() + "do objeto : "+nome;
        }
        return "Não é necessário realizar compras!";
    }
}
