package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	public Zona(String nombre,Zoologico zoo) {
		this.zoo=zoo;
		this.nombre=nombre;
	}
	public Zona(){
		this.zoo = null;}
	
	public void agregarAnimales(Animal entrada) {
		animales.add(entrada);
		}
	public int cantidadAnimales() {
		return animales.size();
		
	}
	

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }
}
