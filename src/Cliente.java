
public class Cliente {

	private String nombre;
	private String apellido;
	private Integer edad;
	public Cliente(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return  "Cliente:" + this.nombre + " " + this.apellido + ", " + this.edad;
	}
	
	public void cumplirAnios() {
		this.edad++;
	}
}
