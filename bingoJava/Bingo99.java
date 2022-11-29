import java.util.ArrayList;
import java.util.Scanner;

public class Bingo99 {
    
    public void jugar(){
        Bola bola1 = new Bola();
        Tabla tabla = new Tabla();

        ArrayList<Integer> casi = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("De enter si quiere jugar");
        input.nextLine();
        tabla.mostrarTabla99();
        int numero;
        do{
            
            numero = bola1.numAleatorio();
            
            if (!casi.contains(numero)){
                casi.add(numero); 
                System.out.println("El numero de la bola es: "+ numero);

                System.out.println("Press Enter");
                input.nextLine();
            }            
        }while(casi.size() != 90);
        System.out.println("\nYa termio");
    }             
}