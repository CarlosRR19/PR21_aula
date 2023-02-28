package centro;

import java.util.Comparator;

public class ComparadorAlumnos implements Comparator<Alumno>{

	private int orden;
	
	//Se le asigna una variable a las posibles opciones válidas de la variable orden
	public static final int ORDEN_ID = 0;
	public static final int ORDEN_PR1 = 1;
	public static final int ORDEN_BBDD1 = 2;

	public ComparadorAlumnos (int orden) {
		this.orden = orden;
	}
	
	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		//Se selecciona el método de ordenación dependiendo del valor "orden" escogido
		int devolver = 0;
		if (orden == ORDEN_ID)
			devolver = o2.getId().compareTo(o1.getId()); 
		else if (orden == ORDEN_PR1)
			devolver = o2.getPr1() - o1.getPr1();
		else
			devolver = o2.getBbdd1() - o1.getBbdd1();
		// TODO Auto-generated method stub
		return devolver;
	}

}
