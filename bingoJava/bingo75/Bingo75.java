package bingo75;
import java.util.Scanner;
import java.util.ArrayList;

public class Bingo75 extends Bingo{
    public Bingo75() {
		super(75);
	}
    Scanner input = new Scanner(System.in);
	

	@Override
	protected void jugar() {
		ArrayList<String> list = new ArrayList<String>(75);
		int times = 1;
		getTablero().inicializar(5, 15);

		while (times != 76) {
			System.out.println("Pulse enter para sacar una bola..");
			input.nextLine();
			while (true){
				Bola bola = new Bola();
				bola = sacarBola();
				if (!list.contains(bola.getValor())){
					list.add(bola.getValor());
					getTablero().imprimirTablero(bola, 5, 15);
					times++;
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println("\nGracias por Jugar a Bingo75 <3\n");
	}
}
