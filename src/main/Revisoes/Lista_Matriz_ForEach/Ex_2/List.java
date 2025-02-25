package Lista_Matriz_ForEach.Ex_2;
//Solicite 5 números ao usuário, armazene em uma lista e calcule a soma de todos os elementos.
import java.util.ArrayList;

public class List {
    private ArrayList<Integer>list;

    public List (){
        this.list = new ArrayList<>();
    }

    public void addNumbers (int num){
        this.list.add(num);
    }

    public void displayNumbers() {
        System.out.println("Numeros digitados:");
        for (int list : list){
            System.out.println(list);
        }
    }

    public int sumNumbers(){
        int sum = 0;
        for (int list : list){
            sum += list;
        }
        return sum;
    }
}
