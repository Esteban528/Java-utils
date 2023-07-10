package trheads;

// Sincronizando hilos con el metodo join()
public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios2 hilo2 = new HilosVarios2(hilo1);
		
		hilo1.start();
		hilo2.start();
		
		System.out.println("Tareas terminadas");
	}
}

class HilosVarios extends Thread {
	public void run () {
		for (int i=0; i<15; i++) {
			System.out.println("Ejecutando hilos: " + getName());
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class HilosVarios2 extends Thread {
	public HilosVarios2 (Thread hilo) {
		this.hilo = hilo;
	}
	
	public void run () {
		// Usando el metodo join() va a sincornizar los hilos de manera que 
		// nada se ejecutará mientras haya un hilo en ejecucion
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0; i<15; i++) {
			System.out.println("Ejecutando hilos: " + getName());
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private Thread hilo;
	
}