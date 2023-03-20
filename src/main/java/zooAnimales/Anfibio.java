package zooAnimales;

public class Anfibio extends Animal{
	private Anfibio[] listado = new Anfibio[0];
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
		Anfibio[] nuevo = new Anfibio[listado.length + 1];
		System.arraycopy(listado, 0, nuevo, 0, listado.length);
		nuevo[nuevo.length - 1] = elemento;
		listado = nuevo;
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
	
    public Anfibio[] getListado() {
        return listado;
    }

    public void setListado(Anfibio[] listado) {
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
