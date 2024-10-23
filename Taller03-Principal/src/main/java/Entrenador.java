public class Entrenador {

	private Equipo equipo;
	private String nombre;
	private int tiempoDeExperencia;
	private String deporteEspecializacion;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		// TODO - implement Entrenador.getCorreoElectronico
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		// TODO - implement Entrenador.setCorreoElectronico
		throw new UnsupportedOperationException();
	}

	public int getTiempoDeExperencia() {
		return this.tiempoDeExperencia;
	}

	/**
	 * 
	 * @param tiempoDeExperencia
	 */
	public void setTiempoDeExperencia(int tiempoDeExperencia) {
		this.tiempoDeExperencia = tiempoDeExperencia;
	}

	public String getDeporteEspecializacion() {
		return this.deporteEspecializacion;
	}

	/**
	 * 
	 * @param deporteEspecializacion
	 */
	public void setDeporteEspecializacion(String deporteEspecializacion) {
		this.deporteEspecializacion = deporteEspecializacion;
	}

}