package zooAnimales;

import gestion.Zona;

public class Animal {
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public static int mamiferos=0;
	public static int aves=0;
	public static int reptiles=0;
	public static int peces=0;
	public static int anfibios=0;
	private static int totalAnimales=mamiferos+aves+reptiles+peces+anfibios;
	
	public Animal(String nombre,int edad, String habitat, String genero){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);}
	public Animal() {}
    /*---------------------*/
	
	
	public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    /*---------------------*/
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+mamiferos+"\nAves: "+aves+"\nReptiles: "+reptiles
				+"\nPeces: "+peces+"\nAnfibios: "+anfibios;
	}
	public String toString() {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "
				+genero;
	}
}
