public class Deportista {

	private Equipo equipo;
	private String nombre;
	private String apellido;
	private String contacto;
	private String deporte;

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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContacto() {
		return this.contacto;
	}

	/**
	 * 
	 * @param contacto
	 */
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

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

	/**
	 * 
	 * @param equipo
	 */
	public boolean registrarEnEquipo(Equipo equipo) {
		// TODO - implement Deportista.registrarEnEquipo
		throw new UnsupportedOperationException();
	}

}