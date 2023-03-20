package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre,int edad, String habitat, String genero, String colorPiel,Boolean venenoso){
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		super.anfibios++;
		agregarEnLista(this);}
		

	public Anfibio() {
		super.anfibios++;
		agregarEnLista(this);
	}
	
	public void agregarEnLista(Anfibio elemento) {
		listado.add(elemento);
	}
	public int cantidadAnfibios(){
		return Animal.anfibios;
	}
	public String movimiento(){
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad,String genero){
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	}
	public static Anfibio crearSalamandra(String nombre, int edad,String genero){
		salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
	}
	
    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
