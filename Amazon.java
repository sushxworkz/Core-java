class Amazon{


	static String productNames[]={null,null,null,null,null,null,null,null,null,null};
	static int start;
	public static boolean addProductName(String productName){
	
		boolean isProductNameAdded=false;
		
		if(start<productNames.length){
		
			if(productName!=null){
			productNames[start++]=productName;
			
			isProductNameAdded=true;
			}
			else
			System.out.println("Product name is Invalid");
		}
		else
			System.out.println("Sorry...product names are full");
		return isProductNameAdded;
		
	}
	
	public static void showProductNames(){
	
		System.out.println("Available Product Names Are:");
		
			for(String productName:productNames){
				System.out.println(productName);
			}
	}
}
	
	