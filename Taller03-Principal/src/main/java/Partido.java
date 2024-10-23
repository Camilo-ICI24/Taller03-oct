import java.util.*;

public class Partido {

	private Cancha terreno;
	private Collection<Equipo> equipo;
	private String equipoLocal;
	private String equipoVisitante;
	private String resultadoFinal;
	private String fechaPartido;
	private Cancha cancha;

	public String getEquipoLocal() {
		return this.equipoLocal;
	}

	/**
	 * 
	 * @param equipoLocal
	 */
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return this.equipoVisitante;
	}

	/**
	 * 
	 * @param equipoVisitante
	 */
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getResultadoFinal() {
		return this.resultadoFinal;
	}

	/**
	 * 
	 * @param resultadoFinal
	 */
	public void setResultadoFinal(String resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

	public String getFechaPartido() {
		return this.fechaPartido;
	}

	/**
	 * 
	 * @param fechaPartido
	 */
	public void setFechaPartido(String fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public Cancha getCancha() {
		return this.cancha;
	}

	/**
	 * 
	 * @param cancha
	 */
	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

}