class TabletsRunner{

	public static void main(String[] lenovo){
	
		System.out.println("Main startted");
		
		boolean connect = Tablets.onOrOff();
		System.out.println("The tablets connected: " +connect);
			connect = Tablets.onOrOff();
		System.out.println("The tablets connected :"  +connect);
		
		System.out.println("Main ended");
	}

}
