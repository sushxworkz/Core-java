class LinkedInAccount{

	
	static long mNumber;
	static String emailId;
	static String pwd;
	static String loginPwd;
	static String fName;
	static String lName;
	static String cLocation;
	static String industry;
	static String cName;
	static String skill;
	static String langauaue;
	static String pct;
	static int experience;
	static String dclg;

	
	public static boolean createUserLinkedInAccount(long mobileNumber,String mail,String password, String loginPassword,String userFirstName,String userLastName,String currentLocation,String workingIndustry,String companyName,String userSkill,String userLanguaue,String project,int userExperience,String degreeCollage ){
		
		 boolean isLinkedInAccountCreated=false;
		 
		 boolean   isMobileNumberValid=false; 
		 boolean isMailValid=false;
		 boolean isPasswordValid=false;
		 boolean isLoginPasswordValid=false;
		 boolean isUserFirstNameValid=false;
		 boolean isUserLastNameValid=false;
		 boolean isCurrentLocationValid=false;
		 boolean isWorkingIndustryValid=false;
		 boolean isCompanynameValid=false;
		 boolean isUserSkillValid=false;
		 boolean isUserLangaueValid=false;
		 boolean isProjectValid=false;
		 boolean isUserExperienceValid=false;
		 boolean isDegreeCollageValid=false;
		 
		 
		
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
		
		if(currentLocation!=null){
			cLocation=currentLocation;
			isCurrentLocationValid=true;
		}
		else
			System.out.println("The cuurent location is Invalid");
		
		if(workingIndustry!=null){
			industry=workingIndustry;
			isWorkingIndustryValid=true;
		}
		else
			System.out.println("The working industry");
		
		if(companyName!=null){
			cName=companyName;
			isCompanynameValid=true;
		}
		else
			System.out.println("The company name");
		
		if(userSkill!=null){
			skill=userSkill;
			isUserSkillValid=true;
		}
		else
			System.out.println("The skill in Invalid");
		
		if(userLanguaue!=null){
			
			langauaue=userLanguaue;
			isUserLangaueValid=true;
		}
		else
			System.out.println("The user language is Invalid");
		
		if(project!=null){
			pct=project;
			isPasswordValid=true;
		}
		else
			System.out.println("The user project Invalid");
		
		if(userExperience!=0){
			experience=userExperience;
			isUserExperienceValid=true;
		}
		else
			System.out.println("The user experience is Invalid");
		
		if(degreeCollage!=null){
			dclg=degreeCollage;
			isDegreeCollageValid=true;
		}
		else
			System.out.println("The user collage is Invalid");
			
		
		
		
		
		if(isMobileNumberValid==true && isMailValid==true  && isPasswordValid==true && isLoginPasswordValid==true && isUserFirstNameValid==true && isUserLastNameValid==true && isCurrentLocationValid==true && isWorkingIndustryValid==true && isCompanynameValid==true  && isUserSkillValid==true && isUserLangaueValid==true && isProjectValid==true && isUserExperienceValid==true && isDegreeCollageValid==true ){
		isLinkedInAccountCreated=true;
		}
		
		return isLinkedInAccountCreated;
	}
	
	public static void readUserLinkedInAccountDetails(){
		
		System.out.println("User Details are");
		
		System.out.println("The user mobile number: "+mNumber);
		System.out.println("The user mail: "+emailId);
		System.out.println("The user password: "+pwd);
		System.out.println("The user login password: "+loginPwd);
		System.out.println("The user first name: "+fName);
		System.out.println("The user last name: "+lName);
		System.out.println("The user current location: "+cLocation);
		System.out.println("The user working industry: "+industry);
		System.out.println("The user company name: "+cName);
		System.out.println("The user skill "+skill);
		System.out.println("The user langauaue: "+langauaue);
		System.out.println("The user project: "+pct);
		System.out.println("The user experience is: "+experience);
		System.out.println("The user degree Collage: "+dclg);
		

		
		
	}
}