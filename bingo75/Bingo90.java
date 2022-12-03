package bingo75;

import java.util.Scanner;

public class Bingo90 extends Bingo {

	public Bingo90() {
		super(90);
	}
	Scanner input = new Scanner(System.in);

	@Override
	protected void jugar() {
		getTablero().inicializar();
		// TODO
		// No debe limitar a 90
		// Controlar que no se repita
		while (!esteLlenoTablero()) {
			System.out.println("Pulse enter para sacar una bola..");
			Bola bola = new Bola();
			input.nextLine();
			bola = sacarBola();
			getTablero().imprimirTablero(bola);
		
		}
	}

	private boolean esteLlenoTablero(){
		for (int i=0; i < this.getTablero().getTablero().size(); i++){
			if (!this.getTablero().getTablero().get(i).isActivo())
				return false;
		}
		return true;
	}

}
