import java.util.*;

public class Equipo {

	private Entrenador coach;
	private Partido partido;
	private Collection<Deportista> deportista;
	private String deporte;
	private Entrenador entrenador;
	private ArrayList<Deportista> jugadores;

	public Equipo(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public String getDeporte() {
		return this.deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Entrenador getEntrenador() {
		return this.entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<Deportista> getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(ArrayList<Deportista> jugadores) {
		this.jugadores = jugadores;
	}

    public boolean registrarEntrenador(Entrenador coach) {
		if (entrenador.getNombre().equals(coach.getNombre())) {
			System.out.println("Coach ya registrado");
			return false;
		}

		this.entrenador = coach;
		return true;
	}
}