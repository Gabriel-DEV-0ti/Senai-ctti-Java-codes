package MetodosClasses.Ex_6_5;

public class Program {
    public static void main(String[] args) {
        double valorMinimo = 100.0;

        Cliente cliente1 = new Cliente ("João", 150.0);
        Cliente cliente2 = new Cliente ("Maria", 50.0);

        System.out.println(cliente1.getNome() + " ganhou brinde? " + (cliente1.ganhouBrinde(valorMinimo) ? "Sim" : "Não"));
        System.out.println(cliente2.getNome() + " ganhou brinde ? " + (cliente2.ganhouBrinde(valorMinimo) ? "Sim" : "Não" ));

    }
}
