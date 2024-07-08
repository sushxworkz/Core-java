class RedBuss{

	static String busNames[]={"SRS","VRL","Rjahansa","Gajanan","Sea Bird","sugma"};
	static String founderNames[]={"Panindr","Sudhakar","Chaan"};
	static String headQuarters="Benglore";
	static int dateFounded=2006;
	
	public static void main(String busName[]){
	
	System.out.println("Main Started");
	System.out.println("WELCOME TO RED BUS");
	System.out.println("Bus Located @ " +headQuarters);
	System.out.println("Bus date Founded " +dateFounded);
	System.out.println("\n");
	System.out.println("The Bus Names");
	
	//System.out.println(busNames);
	
	for(int ref=0;ref<busNames.length;ref++){
		//return value/ref	
		String value =busNames[ref];
		System.out.println(value);
		}
		System.out.println("\n");
		System.out.println("The Bus Founder Names");
		for(int ref=0;ref<founderNames.length;ref++){
		//return value/ref	
		String value =founderNames[ref];
		System.out.println(value);
		}
	System.out.println("Main Ended");
	}
}