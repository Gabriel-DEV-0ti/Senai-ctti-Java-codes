package MetodosClasses.Encapsulamento.Ex_4_1;

public class Numeros {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int somaNum(){
        return num1 + num2;
    }

    public void menorMaior(int sum){
        if (sum > 100){
            System.out.println("O número " + sum + " maior que 100");
        }else {
            System.out.println("O número " + sum + " menor que 100");
        }
    }
}
