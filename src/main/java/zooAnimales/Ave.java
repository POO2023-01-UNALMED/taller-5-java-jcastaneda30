package zooAnimales;

public class Ave extends Animal{
	private Ave[] listado = new Ave[0];
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
		Ave[] nuevo = new Ave[listado.length + 1];
		System.arraycopy(listado, 0, nuevo, 0, listado.length);
		nuevo[nuevo.length - 1] = elemento;
		listado = nuevo;
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

    public Ave[] getListado() {
        return listado;
    }

    public void setListado(Ave[] listado) {
        this.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
	
} 
