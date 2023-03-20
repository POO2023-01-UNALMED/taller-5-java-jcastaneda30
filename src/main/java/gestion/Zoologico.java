package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre,ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {}
		
	public void agregarZonas(Zona nuevoE) {
		zonas.add(nuevoE);
	}
	
	public int cantidadTotalAnimales() {
		int count=0;
		for(int i=0; i<zonas.size();i++) {
			count+=zonas.get(i).cantidadAnimales();
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

    public ArrayList<Zona> getZona() {
        return zonas;
    }
    public void setZona(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}
