package zooAnimales;
import java.util.ArrayList;


public class Ave extends Animal{
	private ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre,int edad, String habitat, String genero, String colorPlumas){
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		aves++;
		agregarEnLista(this);}
	public Ave() {
		aves++;
		agregarEnLista(this);
	}
	public void agregarEnLista(Ave elemento) {
		listado.add(elemento);

	}
	public int cantidadAves() {
		return Animal.aves;
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad,String genero){
		halcones++;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	public static Ave crearAguila(String nombre, int edad,String genero){
		aguilas++;
		return new Ave(nombre,edad,"montanas",genero,"blanco amarillo");
	}

    public ArrayList<Ave> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Ave> listado) {
        this.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
	
} 
