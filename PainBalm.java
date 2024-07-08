class PainBalm{

	static String name="Amrutanjan";
	static double price=120;
	static int qtygms=20;
	static  String ingrediants[]= {" Pudina","Gandhapura Patra Taila","paraffin"};

	public static void main(String[] painBalm){
	
	System.out.println("Main Started");
	System.out.println("The Details of " +name + "are :");
	System.out.println("The Price of " +name + " is" +price);
	System.out.println("The Quantity of " +qtygms);
	
	for(String ingrediant:ingrediants){
		System.out.println(ingrediant);
		}
	}
}
	