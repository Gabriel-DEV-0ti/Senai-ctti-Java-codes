package Lista_Matriz_ForEach.Ex_3;
//Solicite 6 números ao usuário, armazene em uma lista e calcule a média dos valores.
import java.util.ArrayList;

public class List {
    private ArrayList<Integer>list;

    public List(){
        this.list = new ArrayList<>();
    }

    public void addNumbers (int num){
        this.list.add(num);
    }

    public void displayNumbers(){
        System.out.println("Números digitados: ");
        for (int list : list){
            System.out.println(list);
        }
    }

    public int averageNumbers(){
        int average = 0;
        for (int list : list){
            average += list;
        }
        average /= 6;
        return average;
    }
}
