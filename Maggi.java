class Maggi{
	static String name="Atta Maggi";
	static double price =30;
	static int qtyIngm = 290;
	static String ingrediants[]={"Wheat flour ","Palm oil","Iodised salt","Dehydrated spinach","Gluten"};
	
	public static void main(String[] testy){
	
	System.out.println("Main Started");
	System.out.println("The Details of " +name + "are :");
	System.out.println("The Price of " +name + " is" +price);
	System.out.println("The Quantity of " +qtyIngm);
	System.out.println("The Ingrediants Are\n");
	
	for(String ingrediant:ingrediants){
		System.out.println(ingrediant);
		}
		System.out.println("Main Ended");
	}
}
	