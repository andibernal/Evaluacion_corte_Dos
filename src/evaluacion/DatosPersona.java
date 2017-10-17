package evaluacion;


public class DatosPersona {
	String nombre, apellido,direccion,datos,tipo,genero;
	int cedula,edad,celular,peso,altura;
	
	public DatosPersona(int ced, String nom, String ape, int edad, String tipo, String genero, int celular, int peso, int altura, String direccion) {
		this.cedula=ced;
		this.nombre=nom;
		this.apellido=ape;
		this.edad=edad;
		this.tipo=tipo;
		this.genero=genero;
		this.celular=celular;
		this.peso=peso;
		this.altura=altura;
		this.direccion=direccion;
		
	}
	public DatosPersona(String nom, String ape, int edad,  String tipo, String genero, int celular, int peso, int altura, String direccion) {
		
		this.nombre=nom;
		this.apellido=ape;
		this.edad=edad;
		this.tipo=tipo;
		this.genero=genero;
		this.celular=celular;
		this.peso=peso;
		this.altura=altura;
		this.direccion=direccion;

	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public int getCed() {
		return cedula;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setCed(int c) {
		this.cedula=c;
	}
	public void setNombre(String c) {
		this.nombre=c;
	}
	public void setApellido(String c) {
		this.apellido=c;
	}
	public void setEdad(int d) {
		this.edad=d;
	}
	public void setDatos(String a, String b, String c) {
		
		a=this.getNombre();
		b=this.getApellido();
		c=Integer.toString(getEdad());
		datos = a+b+c;
		
	}
	public String getDatos() {
		return datos;
	}
	
	public Object[] getDetalles() {
		Object[] data = {this.cedula, this.nombre, this.apellido,this.edad};
		return data;
	}
}
