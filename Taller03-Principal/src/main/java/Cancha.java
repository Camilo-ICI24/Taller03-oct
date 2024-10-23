public class Cancha {

	private Partido partido;
	private String superficie;
	private String ubicacion;
	private int capacidadEspectadores;

	public Cancha(Partido partido, String superficie, String ubicacion,
				  int capacidadEspectadores) { // Inicializando un constructor
		this.partido = partido;
		this.superficie = superficie;
		this.ubicacion = ubicacion;
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public String getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public boolean programarPartido(Partido partido, Cancha cancha) {
		if (cancha.partido != null) {
			if (partido.getFechaPartido() == cancha.partido.getFechaPartido()); {
				System.out.println("Lo siento, ya hay un partido registrado en esta cancha");
			}
			return false;
		} else {
			cancha.partido = partido;
			System.out.println("Partido agendado exitosamente");
		}
		return true;
	}

	public String obtenerDisponibilidad() {
		// TODO - implement Cancha.obtenerDisponibilidad
		throw new UnsupportedOperationException();
	}

	public boolean registrarUsoCanca() {
		// TODO - implement Cancha.registrarUsoCanca
		throw new UnsupportedOperationException();
	}

}