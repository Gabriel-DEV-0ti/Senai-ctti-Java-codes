package MetodosClasses.Ex_6_5;

import javax.xml.namespace.QName;

public class Cliente {
    // Atributos
    private String nome;
    private double valorCompra;
    // Construtor
    public Cliente (String nome, double valorCompra){
        this.nome = nome;
        this.valorCompra = valorCompra;
    }
    // Métodos
    public boolean ganhouBrinde (double valorMinimo){
        return valorCompra >= valorMinimo;
    }
    // Getters e Setters
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
