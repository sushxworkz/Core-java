class House{

	int houseId;
	int noOfRooms;
	int noOfFloors;
	String houseName;
	String areaInSqrt;
	int noOfMembers;
	
	public House(){
		System.out.println("Create the object");
	}
	
	public House(int houseId,int noOfRooms,int noOfFloors,String houseName,String areaInSqrt,	int noOfMembers){
		
		this.houseId=houseId;
		this.noOfRooms=noOfRooms;
		this.noOfFloors=noOfFloors;
		this.houseName=houseName;
		this.areaInSqrt=areaInSqrt;
		this.noOfMembers=noOfMembers;
	}
	
	public void getHouseDetails(){
		
		System.out.println("The House Details Are:");
		System.out.println("House Id is:"+this.houseId);
		System.out.println("House icluding number of rooms are:"+this.noOfRooms);
		System.out.println("House number floors are:"+this.noOfFloors);
		System.out.println("House name is:"+this.houseName);
		System.out.println("House area in sequere is:"+this.areaInSqrt);
		System.out.println("House including number of members are:"+this.noOfMembers);
		
	}
	
}