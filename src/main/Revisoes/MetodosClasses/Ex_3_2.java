package MetodosClasses;
//Determine se uma senha digitada está correta (exemplo: senha esperada é &quot;1234;).
import java.util.Scanner;

public class Ex_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senhaDigitada = sc.nextLine();
        String senhaEsperada = "1234";
        String senhaErrada = "Senha errada, digite novamente!";
        String senhaCorreto = "A senha foi digitada corretamente!";

        String senha = esperada(senhaDigitada, senhaEsperada, senhaErrada, senhaCorreto);
        res(senha);
        sc.close();
    }

    private static String esperada(String senhaDigitada, String senhaEsperada, String senhaErrada, String senhaCorreto) {
        String result;
        if (senhaDigitada.equals(senhaEsperada)) {
            result = senhaEsperada = senhaCorreto;
        }else {
            result = senhaErrada;
        }
        return result;
    }

    private static void res (String senha) {
        System.out.println(senha);
    }
}
