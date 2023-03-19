package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private final Zoologico zoo;
	private Animal[] animales = new Animal[0];
	public Zona(String nombre,Zoologico zoo) {
		this.zoo=zoo;
		this.nombre=nombre;
	}
	public Zona(){
		this.zoo = null;}
	
	public void agregarAnimales(Animal entrada) {
		Animal[] nuevo = new Animal[animales.length + 1];
		System.arraycopy(animales, 0, nuevo, 0, animales.length);
		nuevo[nuevo.length - 1] = entrada;
		animales = nuevo;
		}
	public int cantidadAnimales() {
		return animales.length;
		
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
