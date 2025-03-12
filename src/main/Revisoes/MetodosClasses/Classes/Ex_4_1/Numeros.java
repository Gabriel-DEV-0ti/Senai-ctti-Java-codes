package MetodosClasses.Classes.Ex_4_1;

public class Numeros {
    public int num1;
    public int num2;

    public void somaNum(){
        int soma = num1 + num2;
        if (soma > 100){
            System.out.println("O número " + soma + " maior que 100");
        }else {
            System.out.println("O número " + soma + " menor que 100");
        }
    }
}
