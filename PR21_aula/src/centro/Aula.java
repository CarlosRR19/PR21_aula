package centro;

import java.util.Arrays;

public class Aula {

	private Alumno[] clase;

	public Aula() {
		//Se crea el vector alumnos con los 30 espacios requeridos
		clase = new Alumno[30];

		//Se rellena el vector alumnos
		for (int i = 0; i < clase.length; i++) {

			//Se añade un 0 delante de aquellas cifras menores a 10 para el correcto funcionamiento del comparador
			if (i < 10) {
				//En caso del 0, no hace falta añadrile nada delante
				if (i >= 1)
					clase[i] = new Alumno("DAW" + 0 + i);
				else
					clase[i] = new Alumno("DAW" + i);
			} else
				clase[i] = new Alumno("DAW" + i);
		}
	}

	public void ordenarID() {
		ComparadorAlumnos ca = new ComparadorAlumnos(ComparadorAlumnos.ORDEN_ID);
		Arrays.sort(clase, ca);
	}

	public void ordenarNotaPR1() {
		ComparadorAlumnos ca = new ComparadorAlumnos(ComparadorAlumnos.ORDEN_PR1);
		Arrays.sort(clase, ca);
	}

	public void ordenarNotaBBDD1() {
		ComparadorAlumnos ca = new ComparadorAlumnos(ComparadorAlumnos.ORDEN_BBDD1);
		Arrays.sort(clase, ca);
	}

	public String toString() {
		String devolver = "";
		System.out.println("Hay un total de " + clase.length + " alumnos:");
		for (int i = 0; i < clase.length; i++) {
			System.out.println("[" + i + "]" + clase[i]);
		}

		return devolver;
	}

}
