package MetodosClasses.Classes.Ex_6_5;

public class Cliente {
    public String nome;
    public double valorCompra;

    public Cliente(String nome, double valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public boolean ganhouBrinde (double valorMinimo){
        return valorCompra >= valorMinimo;
    }
}
