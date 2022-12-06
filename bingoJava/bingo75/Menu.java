package bingo75;

import java.util.Scanner;

public class Menu {
    
    public void menuJugar(){
        try (Scanner input = new Scanner(System.in)) {
            int n;	
            while (true){
                System.out.println("---------------- MENU ----------------");
                System.out.print("Bienvenido, ingrese a que bingo quiere jugar: \n1. Bingo 90.\n2. Bingo 75.\n3. Salir.\n- ");
                n = input.nextInt();

                switch(n){
                    case 1 -> {
                        Bingo bingo99 = new Bingo90();
                        bingo99.jugar();
                    }
                    case 2 -> {
                        Bingo bingo75 = new Bingo75();
                        bingo75.jugar();
                    }
                    case 3 -> {
                        System.out.println("\nGracias por Jugar <3\n");
                    }
                    default -> {
                        System.out.println("\nIngreso una opcion incorrecta, intente de nuevo\n");
                    }
                }
                if (n == 3){
                    break;
                }

            }
        }
    }
        
    
}
