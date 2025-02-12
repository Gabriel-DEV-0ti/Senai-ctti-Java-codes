package For_DoWhile.For;
//Calcule a soma dos números de 1 a 100.
public class Ex_05 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++){
            num += i;
        }
        System.out.println(num);
    }
}
