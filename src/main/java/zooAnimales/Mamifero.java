package zooAnimales;

public class Mamifero extends Animal {
	private Mamifero[] listado = new Mamifero[0];
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre,int edad, String habitat, String genero, Boolean pelaje, int patas){
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		super.mamiferos++;
		agregarEnLista(this);
	}
	public Mamifero() {
		super.mamiferos++;
		agregarEnLista(this);}
	
	public void agregarEnLista(Mamifero elemento) {
		Mamifero[] nuevo = new Mamifero[listado.length + 1];
		System.arraycopy(listado, 0, nuevo, 0, listado.length);
		nuevo[nuevo.length - 1] = elemento;
		listado = nuevo;
	}
	public int cantidadMamiferos() {
		return Animal.mamiferos;
	}
	
	public Mamifero crearCaballo(String nombre, int edad,String genero) {
		caballos++;
		return new Mamifero(nombre,edad,"selva",genero,true, 4);
	}
	public Mamifero crearLeon(String nombre, int edad,String genero){
		leones++;
		return new Mamifero(nombre,edad,"selva",genero,true, 4);
	}
}
