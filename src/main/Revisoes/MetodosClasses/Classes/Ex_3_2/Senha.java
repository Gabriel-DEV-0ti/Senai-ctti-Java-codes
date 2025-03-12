package MetodosClasses.Classes.Ex_3_2;

public class Senha {
    public int senhaDigitada;
    public int senhaEsperada = Integer.parseInt("1234");

    public void verificacaoSenha (){
        if (senhaDigitada == senhaEsperada){
            System.out.println("Senha digitada corretamente!!");
        }else {
            System.out.println("Senha incorreta!!");
        }
    }
}
