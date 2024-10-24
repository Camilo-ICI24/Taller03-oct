import java.util.*;

public class Partido {

	private Cancha terreno;
	private Collection<Equipo> equipo;
	private String equipoLocal;
	private String equipoVisitante;
	private String resultadoFinal;
	private String fechaPartido;
	private Cancha cancha;

	public Partido(String equipoLocal, String equipoVisitante, String resultadoFinal,
				   String fechaPartido, Cancha cancha) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.resultadoFinal = resultadoFinal;
		this.fechaPartido = fechaPartido;
		this.cancha = cancha;
	}

	public String getEquipoLocal() {
		return this.equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return this.equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getResultadoFinal() {
		return this.resultadoFinal;
	}

	public void setResultadoFinal(String resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

	public String getFechaPartido() {
		return this.fechaPartido;
	}

	public void setFechaPartido(String fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public Cancha getCancha() {
		return this.cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}
}