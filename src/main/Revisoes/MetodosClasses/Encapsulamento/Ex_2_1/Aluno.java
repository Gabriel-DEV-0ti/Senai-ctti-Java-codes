package MetodosClasses.Encapsulamento.Ex_2_1;

public class Aluno {

    private double nota1;
    private double nota2;
    private double media;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double caucularMedia(){
        return (nota1 + nota2) / 2;
    }

    public void verificarAprovacao(double media){
        System.out.println("A média das notas é: " + media);
        if (media >= 7){
            System.out.println("Aluno aprovado!!");
        }else {
            System.out.println("Aluno reporvado!!!");
        }
    }
}
