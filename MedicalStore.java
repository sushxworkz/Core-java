import java.util.Arrays;
class MedicalStore{

	static String medicineNames[]={null,null,null,null,null,null,null,null,null,null};
	static int start;
	
	public static boolean addMedicineName(String medicineName){

		boolean isMedicineNameAdded=false;
			if(start< medicineNames.length){
			
				if(medicineName!=null){
				 medicineNames[start++]= medicineName;
				}
				else
					System.out.println("Medicine name is Invalid");
					isMedicineNameAdded=true;
				}
			else
				System.out.println("Sorry...Medicine names are full");
		return isMedicineNameAdded;
	}
	
	public static void showMedicineNames(){
	
		System.out.println("Available Medicine Names Are:");
		
		for(String medicineName:medicineNames){
			System.out.println(medicineName);
		}
	}
	
	public static boolean updateMedicineName(String oldMedicineName,String newMedicineName){
		
		boolean isMedicineNameUpdated=false;
		for(int position=0; position<medicineNames.length;position++){
			if(medicineNames[position]==oldMedicineName){
				medicineNames[position]=newMedicineName;
			isMedicineNameUpdated=true;
			}
		}
		if(isMedicineNameUpdated==false)
			System.out.println(oldMedicineName+"not found");
		
		return isMedicineNameUpdated;
	}
	
	public static  boolean deleteMedicineName(String medicineName){
		boolean isMedicineNameDeleted=false;
		int position,newPosition;
		for(position=0,newPosition=0;position<medicineNames.length;position++){
			if(medicineNames[position]!=medicineName){
				medicineNames[newPosition]=medicineNames[position];
				newPosition++;
				
			}
			else
				isMedicineNameDeleted=true;
		}
		int newLength=newPosition;
		medicineNames=Arrays.copyOf(medicineNames,newLength);
	
	if(isMedicineNameDeleted==false){
		System.out.println(medicineNames+"not found");
		
	}
	
	return isMedicineNameDeleted;
	}
}
			