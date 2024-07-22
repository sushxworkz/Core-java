class XWorkzRegistration{
	
	static String fName;
	static String lName;
	static String fathName;
	static String mName;
	static long mNumber;
	static String emailId;
	static String dateOfBirth;
	static double cgpa;
	static String cName;
	
	
	
	public static boolean createUserXWorkzRegister(String userFirstName,String userLastName,String fatherName,String motherName,long mobileNumber,String mail,String dob,double userCgpa,String collageName){
		
		 boolean isXWorkzRegisterCreated=false;
		 
		 boolean isUserFirstNameValid=false;
		 boolean isUserLastNameValid=false;
		 boolean isFatherNameValid=false;
		 boolean isMotherNameValid=false;
		  boolean   isMobileNumberValid=false; 
		 boolean isMailValid=false;
		 boolean isDobValid=false;
		 boolean isUserCgpaValid=false;
		 boolean isCollageNameValid=false;
		 
		 
		
		
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
			
		if(fatherName!=null){
			fathName=fatherName;
			isFatherNameValid=true;
		}
		else
			System.out.println("The fathe name is Invalid");
		
		if(mName!=null){
			mName=motherName;
			isMobileNumberValid=true;
		}
		else 
			System.out.println("The mother name is Invalid");
		
			
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
		
		if(dob!=null){
			dateOfBirth=dob;
			isDobValid=true;
		}
		else
			System.out.println("The user date of birth is Invalid");
		
		if(userCgpa!=0.0){
			cgpa=userCgpa;
			isUserCgpaValid=true;
		}
		else
			System.out.println("The user cgpa is Invalid");
		
		if(collageName!=null){
			cName=collageName;
			isCollageNameValid=true;
		}
		else
			System.out.println("The collage name Invalid" );
		
		
		
		if( isUserFirstNameValid==true && isUserLastNameValid==true && isMobileNumberValid==true && isMailValid==true && isFatherNameValid==true && isMotherNameValid==true && isDobValid==true &&  isUserCgpaValid==true && isCollageNameValid==true ){
		isXWorkzRegisterCreated=true;
		}
		
		return isXWorkzRegisterCreated;
	}
	
	public static void readUserXWorkzRegisterDetails(){
		
		System.out.println("User Details are");
		
		
		System.out.println("The user first name: "+fName);
		System.out.println("The user last name: "+lName);
		System.out.println("The user father name: "+fathName);
		System.out.println("The user mother name: "+mName);
		System.out.println("The user mobile number: "+mNumber);
		System.out.println("The user mail: "+emailId);
		System.out.println("The user cgpa: "+cgpa);
		System.out.println("The user collage name: "+cName);

		
		
	}
}