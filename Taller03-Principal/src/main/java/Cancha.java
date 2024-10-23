public class Cancha {

	private Partido partido;
	private String superficie;
	private String ubicacion;
	private int capacidadEspectadores;

	Cancha(Partido partido, String superficie, String ubicacion,
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

	public boolean obtenerDisponibilidad(Cancha cancha) {
		if (cancha.partido == null) {
			System.out.println("Esta cancha se encuentra disponible");
			return true;
		}
		System.out.println("Esta cancha no se encuentra disponible");
		return false;
	}

	public boolean registrarUsoCancha(Cancha cancha) {
		if (cancha.partido != null) {
			System.out.println("No es posible registrar el uso de esta cancha");
			return false;
		} else {
			System.out.println("Uso de la cancha registrada");
		}
		return true;
	}

}