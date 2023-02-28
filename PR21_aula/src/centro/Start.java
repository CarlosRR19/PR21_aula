package centro;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un aula
		Aula daw1 = new Aula();
		System.out.println(daw1);
		
		//Se ordena e imprime por el criterio ID
		daw1.ordenarID();
		System.out.println(daw1);
		
		//Se ordena e imprime por el criterio PR1
		daw1.ordenarNotaPR1();
		System.out.println(daw1);
		
		//Se ordena e imprime por el criterio BBDD1
		daw1.ordenarNotaBBDD1();
		System.out.println(daw1);
	}

}
