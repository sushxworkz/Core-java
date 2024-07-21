class ATMCardGenerated{

	static String fName;
	static String fathName;
	static String lName;
	static long actNumber;
	static String ifsc;
	static String bName;
	static String dateOfBirth;
	static String pAddress;
	static String cAddress;
	static long adNumber;
	static long mNumber;

	public static boolean createUserATMCard(String firstName,String fatherName,String lastName,long accountNumber,String iFSCCode, String bankName,String dob,String permenentAddress,String currentAddress,long adharNumber,long mobileNumber){
		
		
			 boolean isATMCardCreated=false;
			 
			 fName=firstName;
			 fathName=fatherName;
			 lName=lastName;
			 actNumber=accountNumber;
			 ifsc=iFSCCode;
			 bName=bankName;
			 dateOfBirth=dob;
			 pAddress=permenentAddress;
			  cAddress=currentAddress;
			  adNumber=adharNumber;
			 mNumber=mobileNumber;
			 
			 
			isATMCardCreated=true;
			
			return isATMCardCreated;
	}
	
	
	public static void readUserATMCardDetails(){
	
		System.out.println("User Details Are: ");
		
		System.out.println("The user first name is: "+fName);
		System.out.println("The user father name is: "+fathName);
		System.out.println("The user last name is: "+lName);
		System.out.println("The user account number: "+actNumber);
		System.out.println("The user IFSC Code: "+ifsc);
		System.out.println("The user bankr name: "+bName);
		System.out.println("The user first date of birth is: "+dateOfBirth);
		System.out.println("The user permenent address is: "+pAddress);
		System.out.println("The user current address: "+cAddress);
		System.out.println("The user adhar number: "+adNumber);
		System.out.println("The user mobile number: "+mNumber);
		
	}
}