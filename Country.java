class Country{

	String countryId;
	int  noOfStates;
	String primeMinister;
	String population;
	
	public Country(){
		System.out.println("Create the object");
	}
	
	public Country(String countryId,int  noOfStates,String primeMinister,String population){
		
		this.countryId=countryId;
		this.noOfStates=noOfStates;
		this.primeMinister=primeMinister;
		this.population=population;
		
	}
	
	public void getCountryDetails(){
		
		System.out.println("The Country Details Are:");
		System.out.println("The Country Id is:"+	this.countryId);
		System.out.println("The Country States Are :"+this.noOfStates);
		System.out.println("The Country Prime Minister is:"+this.primeMinister);
		System.out.println("The Country population is:"+this.population);
}
}