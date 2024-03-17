
import java.util.Scanner;
public class projectLab {
public static void main(String []args) {
	   Scanner sc =new Scanner (System.in);
	   
	   //to print the table 
		System.out.println("🎁🎁 BEST OFFERS 🎁🎁 20%\t\t\t\t \t   <== ✈️✈️ THE FLIGHTS FOR JUNE AND JULY ✈️✈️ ==>");
        for (int i = 0; i < 52; i++) 
         	System.out.print("===");
        System.out.println();
        char[][]star=new char [2][120];
        String []contry= {"Germany"," Japan", "France"," Turkey", "Egypt", "Algeria" ,"Tunisia","The moldive Islands"};
		String []FlightDate=   {"1/5/2022","5/5/2022","10/5/2022","18/5/2022","30/5/2022","2/6/2022","25/6/2022","30/6/2022"};
		String []BookingDate=  {"30/3/2022","1/4/2022","2/4/2022","3/4/2022","4/4/2022","5/4/2022","6/4/2022","7/4/2022"};
	    int []nums=     {101,102,103,104,105,106,107,108};
	    double []costs= {20000,30000,18000,13000,25000,55000,22000,80000};
	    
		Trips(nums, contry,FlightDate,costs);
		System.out.println();
		
		for (int i = 0; i < 52; i++) 
         	System.out.print("===");
		
	    for (int count=1;count<=100;count++) {
	    	
	    //to print the ticket(from user)!
	    System.out.println();System.out.println();System.out.println("\t\t\t\t\t\t\t<< WELCOME IN KHAYAL COMPANY >>");
		
		System.out.println("ENTER YOUR FLIGHT NUMBER ✏️  Please  ");
		int num=sc.nextInt();
		
		System.out.print("THE NAME ✏️ ");
		String name1=sc.nextLine();
		String name=sc.nextLine();
		name=name.toUpperCase();
		
        // from computer (for print ticket )!
		System.out.println("TAKE YOUR TICKET ...");System.out.println();System.out.println();
	
		    System.out.println("\t\t|| KHAYAL TRAVEL AND AVIATION COMPANY ✈️\t\t\t\t A ROUND-FLIGHT TICKET || ");
		    System.out.println("\t\t|| PALESTINE INTERNATIONAL AIRPORT  \t\t\t\t📌 TICKET NUMBER  "+count + "    || ");
		    System.out.println();System.out.println("\t\t|| THE NAME : "+name+"\t\t\t\t\t\t  THE SEAT : "+(int )((Math.random()*40)+1)+"        ||");
		    System.out.println("\t\t|| THE FLIGHT NUMBER : "+num);
		    
		    
		    
		    switch(num) {
		    case 101:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[0]+"\t\t\t\t\t  The Cost : "+costs[0]+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[0]);}break;
		    case 102:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[1]+"\t\t\t\t\t  The Cost : "+costs[1]+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[1]);}break;
		    case 103:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[2]+"\t\t\t\t\t  The Cost : "+costs[2]+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[2]);}break;
		    case 104:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[3]+"\t\t\t\t\t  The Cost : "+costs[3]+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[3]);}break;
		    case 105:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[4]+"\t\t\t\t\t  The Cost : "+costs[4]+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[4]);}break;
		    case 106:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[5]+"\t\t\t\t\t  The Cost : "+(int)(costs[5]-costs[5]*0.20)+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[5]);}break;
		    case 107:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[6]+"\t\t\t\t\t  The Cost : "+(int)(costs[6]-costs[6]*0.20)+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[6]);}break;
		    case 108:{ System.out.println("\t\t|| BOOKING DATE : "+BookingDate[7]+"\t\t\t\t\t  The Cost : "+(int)(costs[7]-costs[7]*0.20)+" $ ||");
		    System.out.println("\t\t|| FLIGHT DATE : "+FlightDate[7]);}break;
		    }
             System.out.println();
             
             
		    System.out.println("THANK YOU FOR TRUSTING US...🖤 ");System.out.println();
		    
		    
		    for (int i = 0; i < star.length; i++) {
				for (int j = 0; j < star[i].length; j++) { 
					star[i][j]='-';
					System.out.print(star[i][j]);
				}
				System.out.println();
			}}
		    
		
	    
	    
	   }



    //Method to print the Upcoming trips this month >>
	public static void Trips(int []nums,String []country,String[]Fdate,double cost[]) {
		  System.out.print("* THE NUMBER 👉 : "+"\t");
		  
		  for (int i=0;i<nums.length;i++) 
			   System.out.print(nums[i]+"\t\t");
		  System.out.println();
		 

	    System.out.print("* THE DATE 📅  : "+"\t"); 
		  
		  for(int j=0;j<Fdate.length;j++) 
				  System.out.print(Fdate[j]+"\t");
		  System.out.println();
		  System.out.print("* THE COUNTRY 🏴 : \t");
			
			  for(int i=0;i<country.length;i++)
				  System.out.print(country[i]+"\t\t");
			  System.out.println();
			  System.out.print("* THE COST 💰  : \t");
				
			  for(int i=0;i<cost.length;i++) {
				  if (i==6||i==7||i==5) {
				  System.out.print(cost[i]+" $"+" 🎁\t");}
			      else 
				  System.out.print(cost[i]+" $"+"\t");
			  }

}

}