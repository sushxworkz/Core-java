class SocialMedia{

	int socialMediaId;
	String name;
	String profileName;
	String email;
	
	public SocialMedia(){
		System.out.println("Create the object");
	}
	
	public SocialMedia(int socialMediaId,String name,String profileName,String email){
	
			this.	socialMediaId=socialMediaId;
			this.	name=name;
			this.	profileName=profileName;
			this.	email=email;
	}
	
	public void getSocialMedia(){
		
		System.out.println("The Social Media Details:");
		System.out.println("The Social Media Id is:"+this.socialMediaId);
		System.out.println("The Social Media Name is:"+this.name);
		System.out.println("The Social Media Profile Name  is:"+this.profileName);
		System.out.println("The Social Media Email is:"+this.email);
	}
	
				
}