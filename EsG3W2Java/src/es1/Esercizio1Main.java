package es1;

public class Esercizio1Main {

	public static void main(String[] args) {
		 Thread thread1 = new Thread(new SymbolPrinter("*"));
	        Thread thread2 = new Thread(new SymbolPrinter("#"));
	        
	        

	        thread1.start();
	        thread2.start();

	}

}
