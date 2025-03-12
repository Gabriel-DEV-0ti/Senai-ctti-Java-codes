package MetodosClasses.Classes.Ex_5_1;

public class Idade {
    public int age;

    public void comparandoIdade(){
        if (age <= 12){
            System.out.println("Você é uma criança");
        } else if (age >= 13 && age <= 18) {
            System.out.println("Você é um adolecente");
        } else if (age >= 19 && age <=59) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
    }
}
