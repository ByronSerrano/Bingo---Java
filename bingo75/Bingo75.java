package bingo75;
import java.util.Scanner;

public class Bingo75 extends Bingo{
    public Bingo75() {
		super(75);
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

		System.out.println("\nYa se lleno la tabla\n");
	}

	private boolean esteLlenoTablero(){
		for (int i=0; i < this.getTablero().getTablero().size(); i++){
			if (!this.getTablero().getTablero().get(i).isActivo())
				return false;
		}
		return true;
	}
}
