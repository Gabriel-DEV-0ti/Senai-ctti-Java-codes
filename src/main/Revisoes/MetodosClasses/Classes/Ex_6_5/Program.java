package MetodosClasses.Classes.Ex_6_5;

public class Program {
    public static void main(String[] args) {
        double valorMinimo = 100.0;

        Cliente cliente1 = new Cliente("João", 150.0);
        Cliente cliente2 = new Cliente("Maria", 50.0);

        if (cliente1.ganhouBrinde(valorMinimo)) {
            System.out.println(cliente1.nome + " ganhou brinde!");
        } else {
            System.out.println(cliente1.nome + " não ganhou brinde.");
        }

        if (cliente2.ganhouBrinde(valorMinimo)) {
            System.out.println(cliente2.nome + " ganhou brinde!");
        } else {
            System.out.println(cliente2.nome + " não ganhou brinde.");
        }
    }
}
