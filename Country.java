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
		
}