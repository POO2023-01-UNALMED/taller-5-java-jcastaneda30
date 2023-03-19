package zooAnimales;

public class Reptil extends Animal{
	private Reptil[] listado=new Reptil[0];
	public int  iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad, String habitat, String genero, String colorEscamas, int largoCola){
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		super.reptiles++;
		agregarEnLista(this);}
    public Reptil() {
    	super.reptiles++;
    	agregarEnLista(this);
    }
	public void agregarEnLista(Reptil elemento) {
		Reptil[] nuevo = new Reptil[listado.length + 1];
		System.arraycopy(listado, 0, nuevo, 0, listado.length);
		nuevo[nuevo.length - 1] = elemento;
		listado = nuevo;
	}
	
	public int cantidadReptiles(){
		return Animal.reptiles;
	}
	public String movimiento(){
		return "reptar";
	}
	public Reptil crearIguana(String nombre, int edad,String genero){
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero,"verde",3);
	}
	public Reptil crearSerpiente(String nombre, int edad,String genero){
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero,"blanco",1);
	}
	public Reptil[] getListado() {
        return listado;
    }

    public void setListado(Reptil[] listado) {
        this.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}
