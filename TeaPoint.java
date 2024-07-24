class TeaPoint{


		static String teaNames[]={null,null,null,null,null,null};
		static  int start;
		public static boolean addTeaName(String teaName){
		
			boolean isTeaNameAdded=false;
			
			if(start<teaNames.length){
			if(teaName!=null){
			
				teaNames[start++]=teaName;
				//start++;
				isTeaNameAdded=true;
			}
			else
			System.out.println("Tea Name Invalid");
			}
			else 
				System.out.println("Sorry ....tea names are full");
			
		return isTeaNameAdded;
		}
		
		public static void showTeaNames(){
		
			System.out.println("Tea Names are Available");
			
				for(String teaName:teaNames){
					System.out.println(teaName);
				}
		}
}
			
				
			