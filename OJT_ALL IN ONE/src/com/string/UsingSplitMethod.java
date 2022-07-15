package com.string;

public class UsingSplitMethod {

	public static void main(String[] args) 
	{
		
		   String str="Split Method by Sachin Zade";  
	         
	        System.out.println("This is for num = 0:");  
	        for(String splits:str.split("\\s",0)) {  
	            System.out.println(splits);  
	        }
	        System.out.println();
	 
	        System.out.println("This is for num = 1:");  
	        for(String splits:str.split("\\s",1)) {  
	            System.out.println(splits);  
	        }
	        System.out.println();
	         
	        System.out.println("This is for num = 2:");  
	        for(String splits:str.split("\\s",2)) {  
	            System.out.println(splits);  
	        }
	        System.out.println();
	         
	        System.out.println("This is for num = -1:");
	        for(String splits:str.split("\\s",-1)) {
	            System.out.println(splits);
	        }
	        System.out.println();
	         
	        System.out.println("This is for num = -2:");
	        for(String splits:str.split("\\s",-2)) {
	            System.out.println(splits);
	        }
	        System.out.println();
	         
	        System.out.println("This is for num = 3:");
	        for(String splits:str.split("\\s",3)) {
	            System.out.println(splits);
	        }
	        
	        System.out.println("\nExtracting the a Letter from the String");
	        
	        String s = "SACHIN";
	        char []car = s.toCharArray();
	        for (int i = 0; i < car.length; i++) {
				if(car[i] == 'H'){
					System.out.println("\n\t" + car[i]);
				}
			}
	}

}
