package zooAnimales;
import java.util.ArrayList;


public class Pez extends Animal{
	private ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		super.peces++;
		agregarEnLista(this);}
	public Pez() {
		super.peces++;
		agregarEnLista(this);
	}
	public void agregarEnLista(Pez elemento) {
		listado.add(elemento);

	}
	
	public  int cantidadPeces(){
		return Animal.peces;
	}
	public String movimiento(){
		return "nadar";}
	public static Pez crearSalmon(String nombre, int edad,String genero){
		salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	public static Pez crearBacalao(String nombre, int edad,String genero){
		bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	
    public ArrayList<Pez> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Pez> listado) {
        this.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
