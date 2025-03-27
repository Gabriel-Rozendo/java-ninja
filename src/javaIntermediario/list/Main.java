package javaIntermediario.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos, nao alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Array: " + ninjasArray); // Referência de memoria
        System.out.println("Printando Array: " + ninjasArray[0]);

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("ninjasArray: " + ninjasArray[i]);
        }

        // Listas
        // Nao sao estaticas, podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki"); // Index 0
        ninjasList.add("Sasuke Uchiha"); // Index 1
        ninjasList.add("Sakura Haruno"); // Index 2
        ninjasList.add("Tobirama Senju"); // Index 3

        // Adicionar na lista
        ninjasList.add("Kakashi Hatake");
        System.out.println("Printando List: " + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Printando List: " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("Printando List: " + ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos");

    }
}
