class AmazonAccountGenerated{


	static long mNumber;
	static String emailId;
	static String pwd;
	static String loginPwd;
	static String fName;
	static String lName;
	
	
	
	public static boolean createUserAmazonAccount(long mobileNumber,String mail,String password, String loginPassword,String userFirstName,String userLastName){
		
		 boolean isAmazonAccountCreated=false;
		 
		 isAmazonAccountCreated=validateAmazonUserDetails( mobileNumber, mail, password,  loginPassword, userFirstName, userLastName);
		 
		
		return isAmazonAccountCreated;
	}
	
	public static boolean validateAmazonUserDetails(long mobileNumber,String mail,String password, String loginPassword,String userFirstName,String userLastName){
		
		boolean isAllFieldsValidated=false;
		
		 boolean   isMobileNumberValid=false; 
		 boolean isMailValid=false;
		 boolean isPasswordValid=false;
		 boolean isLoginPasswordValid=false;
		 boolean isUserFirstNameValid=false;
		 boolean isUserLastNameValid=false;
		 
		 
		
		if(mobileNumber!=0){
			
			mNumber=mobileNumber;
			isMobileNumberValid=true;
		}
		else 
			System.out.println("The mobile number is InValid");
		
		if(mail!=null){
			
			emailId=mail;
			isMailValid=true;
		}
		else
			System.out.println("The user mail is InValid");
		
		if(password!=null){
			
			pwd=password;
			isPasswordValid=true;
		}
		else
			System.out.println("The password is Invalid");
		
		if(loginPassword!=null){
			
			loginPwd=loginPassword;
			isLoginPasswordValid=true;
		}
		else 
			System.out.println("The login password is Invalid");
		
		if(userFirstName!=null){
			
			
			fName=userFirstName;
			isUserFirstNameValid=true;
		}
		else
			System.out.println("The user first name is Invalid");
		
		if(userLastName!=null){
			
			lName=userLastName;
			isUserLastNameValid=true;
		}
		else 
			System.out.println("The user last name is Invalid");
		
		
		
		if(isMobileNumberValid==true && isMailValid==true  && isPasswordValid==true && isLoginPasswordValid==true && isUserFirstNameValid==true && isUserLastNameValid==true ){
		isAllFieldsValidated=true;
		}
		
		return isAllFieldsValidated;
	}
	
	public static void readUserAmazonAccountDetails(){
		
		System.out.println("User Details are");
		
		System.out.println("The user mobile number: "+mNumber);
		System.out.println("The user mail: "+emailId);
		System.out.println("The user password: "+pwd);
		System.out.println("The user login password: "+loginPwd);
		System.out.println("The user first name: "+fName);
		System.out.println("The user last name: "+lName);

		
		
	}
}