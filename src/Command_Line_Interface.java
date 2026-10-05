package Project;
import java.util.Scanner;
public class Command_Line_Interface {
	
	public static void welcomeMessage() {
	System.out.println("---Welcome to the Garden Center!---");
	}
	
	public static void printOptions() {
		System.out.println("1. Show stocks");
		System.out.println("2. Sell bonsai");
		System.out.println("3. Sell cacti");
		System.out.println("4. Stock level dropping");
		System.out.println("5. Total sales for the day");
		System.out.println("6. Ask for advice");
		System.out.println("7. Exit");
		System.out.print("Please select a number: 1, 2, 3, 4, 5, 6 or 7:    ");
	}
	
	public static void main(String args[]) {
		Store store = new Store();
		Garden_Center center = new Garden_Center(store);
		Store_Stuff stuff = new Store_Stuff("Caoimhe Byrne", 0.1);
		welcomeMessage();
		center.startPlanting();
		store.startPlanting();
		System.out.println("Ready for sale!");
		
		Scanner in = new Scanner(System.in);
		
		 while (true) {
	            try {
	            	printOptions();
	                int choice = in.nextInt();

	                if (choice == 1) { 
	                	 System.out.println();
	                	store.showStock();
	                	System.out.println();
	                	
	                } 
	                else if (choice == 2) {
	                	 System.out.println();
	                	System.out.println("Please enter quantity: ");
	                	int enterQuantity = in.nextInt();
	                	Bonsai b = new Bonsai(100);  
	                	store.sell_bonsaiTree(enterQuantity, b);
	                    System.out.println();
	                } 
	                else if (choice == 3){
	                	 System.out.println();
	                	System.out.println("Please enter quantity: ");
	                	int enterQuantity = in.nextInt();
	                	Cacti c = new Cacti(30);  
	                	store.sell_cacti(enterQuantity, c);
	                	System.out.println();
	                } 
	                else if (choice == 4) {
	                	 System.out.println();
	                    store.stockLevel_dropping();
	                    System.out.println();
	                } 
	                else if (choice == 5) {
	                	 System.out.println();
	                    center.showDailySales();
	                    System.out.println();
	                } 
	                else if (choice == 6){
	                	 System.out.println();
	                	stuff.request = true;              
	                    stuff.makeRequest(center.gar); 
	                    System.out.println();
	         
	                }
	                else if (choice == 7){
	                	 System.out.println();
	                    System.out.println("Exit");
	                    break; 
	                }
	                else{
	                	 System.out.println();
	                    System.out.println("Invalid choice. Please select a number: 1, 2, 3, 4, 5, 6 or 7.");
	                }
	            } 
	            catch(Exception e) {
	            	 System.out.println();
	                System.out.println("Not an integer number. Try again.");
	                in.nextLine(); 
	            }
	        }

	        in.close();
	}
}
