package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
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
		listado.add(elemento);
	}
	public int cantidadMamiferos() {
		return Animal.mamiferos;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad,String genero) {
		caballos++;
		return new Mamifero(nombre,edad,"selva",genero,true, 4);
	}
	public static Mamifero crearLeon(String nombre, int edad,String genero){
		leones++;
		return new Mamifero(nombre,edad,"selva",genero,true, 4);
	}
	
	public boolean isPelaje() {
	    return this.pelaje;
	}

	public void setPelaje(boolean pelaje) {
	    this.pelaje = pelaje;
	}

	public int getPatas() {
	    return this.patas;
	}

	public void setPatas(int patas) {
	    this.patas = patas;
	}
	public ArrayList<Mamifero> getListado() {
	    return this.listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
	    this.listado = listado;
	}
	
	
}
