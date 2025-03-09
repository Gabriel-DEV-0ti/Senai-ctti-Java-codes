package MetodosClasses.Encapsulamento.Ex_3_2;

public class Senha {
    public int senhaDigitada;
    private int senhaEsperada = Integer.parseInt("1234");

    public void setSenhaDigitada(int senhaDigitada) {
        this.senhaDigitada = senhaDigitada;
    }

    public void verificacaoSenha (){
        if (senhaDigitada == senhaEsperada){
            System.out.println("Senha digitada corretamente!!");
        }else {
            System.out.println("Senha incorreta!!");
        }
    }
}
