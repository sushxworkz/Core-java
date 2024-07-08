class Addition{

	public static void main(String[] adding){
		//invoke passing two parameter
		System.out.println("Main started");
		add(20,40);
		add(40,60);
		System.out.println("main ended");
	}
		
	//mathode declaration
		public static void add(int num1,int num2){
			System.out.println("add methode started");
				System.out.println(num1+ num2);
			System.out.println("add methode ended");
		return;
		}
}