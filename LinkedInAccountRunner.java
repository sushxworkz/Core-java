class LinkedInAccountRunner{

	public static void main(String[] linkedIn){
	
		boolean isLinkedInAccountCreated=LinkedInAccount.createUserLinkedInAccount(0,"aishhu@gmail.com","Aishu65","Aishu65","Aishwarya","Amit",null,"Mysore","IT","Python","English",null,0,null);
		
		if(isLinkedInAccountCreated==true)
		LinkedInAccount.readUserLinkedInAccountDetails();
	}
}