package trheads;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {
	public static void main(String[] args) {
		Banco b = new Banco();
		
		for (int i=0; i<100; i++) {
			EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);
			
			Thread t = new Thread(r);
			
			t.start();
		}
	}
}

class Banco {
	public Banco () {
		cuentas = new double[100];
		
		for(int i=0; i<cuentas.length; i++) {
			cuentas[i] = 2000;
		}
		
		saldoSuficiente=cierreBanco.newCondition();
	}
	
	public void transferencia (int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
		cierreBanco.lock();
		
		try {
		
			while (cuentas [cuentaOrigen]<cantidad) { // Verificar que el saldo no sea inferior a la cantidad
				saldoSuficiente.await(); // El hilo se duerme meintras la condicion se cumple
			}
			
			System.out.println(Thread.currentThread());
			
			cuentas[cuentaOrigen] -= cantidad; // Restar el saldo de la cuenta origen
			
			System.out.printf("%19.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			
			cuentas[cuentaDestino] += cantidad; //Sumar el saldo a la cuenta destino
			
			System.out.printf("Saldo total:  %10.2f%n", getSaldoTotal());
			
			saldoSuficiente.signalAll(); // Esto activa los hilos que estaban a la espera
			
		} finally {
			cierreBanco.unlock();
		}
	}
	
	public double getSaldoTotal () {
		double suma_cuentas=0;
		
		for(double a: cuentas) {
			suma_cuentas += a;
		}
		
		return suma_cuentas;
	}
	
	private final double[] cuentas;
	
	private ReentrantLock cierreBanco = new ReentrantLock();
	
	private Condition saldoSuficiente;
}


class EjecucionTransferencias implements Runnable {
	
	public EjecucionTransferencias (Banco b, int de, double max) {
		banco=b;
		deLaCuenta=de;
		cantidadMax=max;
	}
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				int paraLaCuenta=(int) (100*Math.random());
				double cantidad = cantidadMax*Math.random();
				
				banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
				
			
				Thread.sleep((int)(Math.random()*10));
			} 
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
}

