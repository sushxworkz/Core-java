class PrinterRunner{

	public static void main(String[] epson){
	
		System.out.println("Main startted");
		
		boolean connect = Printer.onOrOff();
		System.out.println("The printer connected: " +connect);
			connect = Printer.onOrOff();
		System.out.println("The printer connected :"  +connect);
		
		System.out.println("Main ended");
	}

}
