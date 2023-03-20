package zooAnimales;
import java.util.ArrayList;


public class Reptil extends Animal{
	private ArrayList<Reptil> listado=new ArrayList<Reptil>();
	public static int  iguanas;
	public static int serpientes;
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
		listado.add(elemento);
	}
	
	public int cantidadReptiles(){
		return Animal.reptiles;
	}
	public String movimiento(){
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad,String genero){
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero,"verde",3);
	}
	public static Reptil crearSerpiente(String nombre, int edad,String genero){
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero,"blanco",1);
	}
	public ArrayList<Reptil> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Reptil> listado) {
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
