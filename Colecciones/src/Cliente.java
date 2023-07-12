
public class Cliente {
	
	public Cliente (String nombre, String n_cuenta, double saldo) {
		// Fijar valores del objeto
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getN_cuenta() {
		return n_cuenta;
	}
	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", n_cuenta=" + n_cuenta + ", saldo=" + saldo + "]";
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String nombre;
	private String n_cuenta;
	private double saldo;
}
