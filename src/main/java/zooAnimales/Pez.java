package zooAnimales;

public class Pez extends Animal{
	private Pez[] listado = new Pez[0];
	public int salmones;
	public int bacalaos;
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
		Pez[] nuevo = new Pez[listado.length + 1];
		System.arraycopy(listado, 0, nuevo, 0, listado.length);
		nuevo[nuevo.length - 1] = elemento;
		listado = nuevo;
	}
	
	public  int cantidadPeces(){
		return Animal.peces;
	}
	public String movimiento(){
		return "nadar";}
	public Pez crearSalmon(String nombre, int edad,String genero){
		salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	public Pez crearBacalao(String nombre, int edad,String genero){
		bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	
    public Pez[] getListado() {
        return listado;
    }

    public void setListado(Pez[] listado) {
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
