package MetodosClasses.Encapsulamento.Ex_6_5;

public class Cliente {
    private String nome;
    private double valorCompra;

    public Cliente (String nome, double valorCompra){
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public boolean ganhouBrinde (double valorMinimo){
        return valorCompra >= valorMinimo;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
