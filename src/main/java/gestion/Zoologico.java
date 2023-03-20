package gestion;

public class Zoologico {
	private String nombre,ubicacion;
	private Zona[] zonas = new Zona[0];
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {}
		
	public void agregarZonas(Zona nuevoE) {
		Zona[] nuevo = new Zona[zonas.length + 1];
		System.arraycopy(zonas, 0, nuevo, 0, zonas.length);
		nuevo[nuevo.length - 1] = nuevoE;
		zonas = nuevo;
	}
	
	public int cantidadTotalAnimales() {
		int count=0;
		for(int i=0; i<zonas.length;i++) {
			count+=zonas[i].cantidadAnimales();
		}
		return count;
	}
	
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Zona[] getZona() {
        return zonas;
    }
    public void setZona(Zona[] zonas) {
        this.zonas = zonas;
    }
}
