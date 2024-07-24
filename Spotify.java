class Spotify{


	static long mNumber;
	static String emailId;
	static String pwd;
	static String fName;
	static String logId;
	
	
	
	
	public static boolean createUserSpotifyAccount(long mobileNumber,String mail,String password, String userFirstName,String loginId){
		
		 boolean isSpotifyAccountCreated=false;
		 
		 isSpotifyAccountCreated=validatedSpotifyUserDetails( mobileNumber, mail,password,  userFirstName,loginId);
		  
		return isSpotifyAccountCreated;
	}
	
	public static boolean validatedSpotifyUserDetails(long mobileNumber,String mail,String password, String userFirstName,String loginId){
		
		
		boolean isAllFieldValidated=false;
	
			
		 boolean   isMobileNumberValid=false; 
		 boolean isMailValid=false;
		 boolean isPasswordValid=false;
		 boolean isUserFirstNameValid=false;
		 boolean isLoginIdValid=false;
		 
		 
		
		if(mobileNumber!=0L){
			
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
		
		if(userFirstName!=null){
			
			
			fName=userFirstName;
			isUserFirstNameValid=true;
		}
		else
			System.out.println("The user first name is Invalid");
		
	if(loginId!=null){
			
			logId=loginId;
			isLoginIdValid=true;
		}
		else 
			System.out.println("The login Id is Invalid");
		
		
		
		
		if(isMobileNumberValid==true && isMailValid==true  && isPasswordValid==true &&  isUserFirstNameValid==true && isLoginIdValid==true){
		isAllFieldValidated=true;
		}
			
			
		return isAllFieldValidated;
		
			
		
	}
	
	public static void readUserSpotifyAccountDetails(){
		
		System.out.println("User Details are");
		
		System.out.println("The user mobile number: "+mNumber);
		System.out.println("The user mail: "+emailId);
		System.out.println("The user password: "+pwd);
		System.out.println("The user first name: "+fName);
		System.out.println("The user login id: "+logId);
		

		
		
	}
}