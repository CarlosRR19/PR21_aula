package centro;

public class Alumno {

	private int pr1;
	private int bbdd1;
	private String id;

	public Alumno(String id) {
		this.id = id;
		//Se randominza la generación de notas para agilizar el proceso
		this.pr1 = (int) (Math.random() * 11);
		this.bbdd1 = (int) (Math.random() * 11);
	}

	public int getPr1() {
		return pr1;
	}

	public int getBbdd1() {
		return bbdd1;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", bbdd1=" + bbdd1 + ", pr1=" + pr1 + "]";
	}

}
