import java.util.ArrayList;
import java.util.List;

public class Entrenador {

	private Equipo equipo;
	private String nombre;
	private int tiempoDeExperencia;
	private String deporteEspecializacion;

	Entrenador(Equipo equipo, String nombre, int tiempoDeExperencia,
               String deporteEspecializacion) {
		this.equipo = equipo;
		this.nombre = nombre;
		this.tiempoDeExperencia = tiempoDeExperencia;
		this.deporteEspecializacion = deporteEspecializacion;
	}

	private List<Entrenador> entrenadores = new ArrayList<>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoDeExperencia() {
		return this.tiempoDeExperencia;
	}

	public void setTiempoDeExperencia(int tiempoDeExperencia) {
		this.tiempoDeExperencia = tiempoDeExperencia;
	}

	public String getDeporteEspecializacion() {
		return this.deporteEspecializacion;
	}

	public void setDeporteEspecializacion(String deporteEspecializacion) {
		this.deporteEspecializacion = deporteEspecializacion;
	}

	public boolean registrarEntrenador() {
		for (Entrenador entrenador : entrenadores) {
			if (entrenador.getNombre().equals(this.nombre)) {
				return false;
			}
		}
		entrenadores.add(this);
		return true;
	}
}