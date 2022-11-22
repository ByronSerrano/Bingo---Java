import java.util.Scanner;

public class Bingo {
    
    public void jugar(){
        Bola bola1 = new Bola();
        Tabla tabla = new Tabla();

        int [] casillero = new int [90];
        Scanner input = new Scanner(System.in);
        System.out.println("De enter si quiere jugar");
        input.nextLine();
        tabla.mostrarTabla();
        int i = 0;
        int numero;
        do{
            numero = bola1.numAleatorio();
            casillero[i] = numero; 
            System.out.println("El numero de la bola es: "+ casillero[i]);

            System.out.println("Press Enter");
            input.nextLine();
             
            
            i++;
        }while(i != casillero.length);
        System.out.println("\nYa termio");
    }             
}