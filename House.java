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
		
	
}