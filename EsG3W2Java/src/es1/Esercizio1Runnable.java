package es1;

	
	class SymbolPrinter implements Runnable {
		private String symbol;
		
		public SymbolPrinter(String symbol) {
			this.symbol = symbol;
		}
		
		
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(symbol);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

