class EmailDetails{

	public static void getEmailDetails(String emailId){
		
			
	
		String emailIds[]={"sushmita@gmail.com","suprita34@gmail.com","sneha56@gmail.com","anusha@gmail.com","samm87@gmail.com"};
		
		String names[]={"Sushmita","Suprita","Sneha","Anusha","Sammu"};
	
		
		String dob[]={"31-08-2002","26-04-1999","13-09-2003","01-07-2001","14-03-2002"};
		
		
		
		
		boolean found=false;
		
		System.out.println("User Details Are: ");
		 
			for(int i=0;i<emailIds.length;i++){
			   if (emailIds[i].equalsIgnoreCase(emailId)) {
		  
			System.out.println("Name: "+names[i]);
			System.out.println("Email: "+emailIds[i]);
			System.out.println("Date of birth: "+dob[i]);
			
				found=true;
				
			   }
			}
			
			if(!found){
					System.out.println("Email is not found");
			}
			
	
	}
}