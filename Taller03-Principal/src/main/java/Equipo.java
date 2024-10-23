import java.util.*;

public class Equipo {

	private Entrenador coach;
	private Partido partido;
	private Collection<Deportista> deportista;
	private String deporte;
	private Entrenador entrenador;
	private ArrayList<Deportista> jugadores;

	public String getDeporte() {
		return this.deporte;
	}

	/**
	 * 
	 * @param deporte
	 */
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Entrenador getEntrenador() {
		return this.entrenador;
	}

	/**
	 * 
	 * @param entrenador
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<Deportista> getJugadores() {
		return this.jugadores;
	}

	/**
	 * 
	 * @param jugadores
	 */
	public void setJugadores(ArrayList<Deportista> jugadores) {
		this.jugadores = jugadores;
	}

}