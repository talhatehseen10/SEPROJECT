class Data{
	void studentData(){
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Talha's ID is 11");
		System.out.println("Sohail's ID is 12");
                System.out.println("Shahbaz's ID is 13");
		System.out.println("Hifza's ID is 14");
                System.out.println("Mansoor's ID is 15");
		System.out.print("Enter Student ID:");
		
                int id = in.nextInt();
		System.out.println("**Your requesting record is searched below**");
			if (id == 11){
				String name = "Talha";
				String rollno = "2k17/csee/75";
				System.out.println("Name:"+name);
				System.out.println("Roll no is:"+rollno);
                                    }
		       
		        if (id == 12){
				String name = "Sohail";
				String rollno = "2k17/csee/74";
				System.out.println("Name:"+name);
				System.out.println("Roll no is:"+rollno);
			}
			if (id == 13){
				String name = "Shahbaz";
				String rollno = "2k17/csee/101";
				System.out.println("Name:"+name);
				System.out.println("Roll no is:"+rollno);
				String CNIC="4132-29371626-0-1"; 
				System.out.println(""+CNIC);			
			}
		       if (id == 14){
				String name = "Hifza";
				String rollno = "2k17/csee/43";
				System.out.println("Name:"+name);
				System.out.println("Roll no is:"+rollno);
			        String Cast="Pathan";
			       System.out.println("Cast "+Cast);
			}
			
                       	if (id == 15){
				String name = "Mansoor Ahmed Messo";
				String rollno = "2k17/csme/9";
				String batch= "Pre-Medical";
				System.out.println("Name:"+name);
				System.out.println("Batch:"+batch);
				System.out.println("Roll no is:"+rollno);
			}
	
		

	}
	public static void main(String str[]){
		Data d = new Data();
		d.studentData();	
	}	
}
