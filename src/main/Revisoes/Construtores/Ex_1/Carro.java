package Construtores.Ex_1;

public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void informacoesCarro(){
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
