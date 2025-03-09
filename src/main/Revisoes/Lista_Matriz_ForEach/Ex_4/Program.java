package Lista_Matriz_ForEach.Ex_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            numeros.add(random.nextInt(100) + 1 );
        }

        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("Números gerados: " + numeros);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
