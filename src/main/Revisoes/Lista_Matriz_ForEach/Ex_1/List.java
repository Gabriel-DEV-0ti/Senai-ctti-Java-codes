package Lista_Matriz_ForEach.Ex_1;
//Crie um programa que solicite 5 números ao usuário e os armazene em uma lista. Depois, exiba os números digitados.
import java.util.ArrayList;

public class List {
    private ArrayList<Integer>list;

    public List (){
        this.list = new ArrayList<>();
    }

    public void addNumbers (int num) {
        this.list.add(num);
    }

    public void displayNumbers(){
        System.out.println("Números digitados: ");
        for (int list : list){
            System.out.println(list);
        }
    }
}
