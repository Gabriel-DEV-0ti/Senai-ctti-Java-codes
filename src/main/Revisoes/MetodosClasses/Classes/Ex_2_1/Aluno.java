package MetodosClasses.Classes.Ex_2_1;
/*Receba duas notas e informe se o aluno foi aprovado (média >= 7).*/
public class Aluno {

    public double nota1;
    public double nota2;
    public double media;

    public void calcularMedia() {
        this.media = (nota1 + nota2) / 2;
    }

    public void verificarAprovacao(double media) {
        System.out.println("A média das notas é: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
