package bingo75;

import java.util.ArrayList;
import java.util.Scanner;

public class Bingo90 extends Bingo {

	public Bingo90() {
		super(90);
	}
	Scanner input = new Scanner(System.in);

	@Override
	protected void jugar() {
		ArrayList<String> list = new ArrayList<String>(90);
		int times = 1;
		getTablero().inicializar(9, 10);

		while (times != 91) {
			System.out.println("Pulse enter para sacar una bola..");
			input.nextLine();
			while (true){
				Bola bola = new Bola();
				bola = sacarBola();
				if (!list.contains(bola.getValor())){
					list.add(bola.getValor());
					getTablero().imprimirTablero(bola, 9, 10);
					times++;
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println("\nGracias por Jugar a Bingo99 <3\n");
	}

}
