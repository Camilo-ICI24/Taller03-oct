import java.util.ArrayList;

public class Deporte {

	private String nombre;
	private ArrayList<Equipo> equipos;

	private Deporte(String nombre, ArrayList<Equipo> equipos) {
		this.nombre = nombre;
		this.equipos = equipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Equipo> getEquipos() {
		return this.equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

}