import java.util.Arrays;
class Amazon{


	static String productNames[]={null,null,null,null,null,null,null,null,null,null};
	static int start;
	public static boolean addProductName(String productName){
	
		boolean isProductNameAdded=false;
		
		if(start<productNames.length){
		//validation
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
	
	
	public static boolean updateProductName(String oldProductName,String newProductName){
		
		boolean isProductNameUpdated=false;
		for(int position=0; position<productNames.length;position++){
			if(productNames[position]==oldProductName){
				productNames[position]=newProductName;
				isProductNameUpdated=true;
			}
		}
		if(isProductNameUpdated==false)
			System.out.println(oldProductName+"not found");
		
		return isProductNameUpdated;
	}
	
	public static boolean deleteProductName(String productName){
		
		boolean isProductNameDeleted=false;
		int position,newPosition;
		for(position=0,newPosition=0;position<productNames.length;position++){
			if(productNames[position]!=productName){
				productNames[newPosition]=productNames[position];
				newPosition++;
				
			}
			else
				isProductNameDeleted=true;
		}
		
				int newLength=newPosition;
				productNames=Arrays.copyOf(productNames,newLength);
				
			if(isProductNameDeleted==false){
				System.out.println(productName+"not found");
			}
			
			
			return isProductNameDeleted;
		
	}		
}
	
	