class SBIBankAccountGeneration{
        
	    static String fname ;
		static String lname;
		static long aadhaarNo ;
		static String dob;
		static String location;
		static long phoneNumber ;

		
    public static boolean createUserBankAccount(String firstName, String lastName,long aadhaarNumber,String dOB, String address,long mobileNumber){
	
	     boolean isBankAccountCreated = false ;
		 
		 boolean isFirstName = false;
		 boolean isLatName=false;
		 boolean isAadhaarNumber = false;
		 boolean isDOB = false;
		 boolean isAddress = false;
		 boolean isMobileNumber = false;
		 
		 if(firstName != null){
			fname = firstName ;
			isFirstName = true;
		}else 
			System.out.println("The first name is invalid");
		
		 if(lastName != null){
			lname = lastName ;
			isFirstName = true;
		}else 
			System.out.println("The Last name is invalid");
		
		
		if(aadhaarNumber != 0){
			aadhaarNo = aadhaarNumber ;
			isAadhaarNumber = true;
		}else 
			System.out.println("The adhaar number is invalid");
		 
		 if(dOB != null){
			dob = dOB ;
			isDOB = true;
		}else 
			System.out.println("The date of birth is invalid");
		
		if(address != null){
			location = address ;
			isAddress = true;
		}else 
			System.out.println("The address is invalid");
		 
		 if(mobileNumber != 0){
			phoneNumber = mobileNumber ;
			isMobileNumber = true;
		}else 
			System.out.println("mobile number is invalid");
		 
		 if(isFirstName == true && isLatName==true&& isAadhaarNumber == true && isDOB == true && isAddress == true && isMobileNumber == true){
			 isBankAccountCreated = true; 
		 }

		 
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readUserBankAccountDetails(){
	
	    System.out.println("the user details");
		System.out.println("The User first Name is :" + fname);
		System.out.println("The Userlast Name is :" + lname);
		System.out.println("The User Adhaar Number is :" + aadhaarNo);
		System.out.println("The User Date of Birth is :" + dob);
		System.out.println("The User address is :" + location);
		System.out.println("The User mobile number is :" + phoneNumber);
		
		
	
	}
}