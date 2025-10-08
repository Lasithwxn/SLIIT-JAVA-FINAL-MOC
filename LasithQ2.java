import java.util.Scanner;
public class  LasithQ2{
	public static double calDiscount (int time, double totalAmount){
		
		double finalTotal=0;
		if (time>=19 && time <=21){
			if (totalAmount>=5000){
				finalTotal=totalAmount-(totalAmount/100 *10);
			}
			else if (totalAmount >= 2500){
				finalTotal=totalAmount-(totalAmount/100*7);
			}
			else {
				System.out.println("No discount: Amount below 2500");
			}
		}
		
		else if (time >=22 && time <=23){
			if (totalAmount>=5000){
				finalTotal=totalAmount-(totalAmount/100 *12);
			}
			else if (totalAmount>= 2500){
				finalTotal=totalAmount-(totalAmount/100*9);
			}
			else {
				System.out.println("No discount: Amount below 2500");
			}
		}
		else{
			System.out.println("No discount: Invalid shopping time");
			
		}
           return finalTotal;
	}
	


	public static void displayGift (double finalTotal){
		
		if(finalTotal >= 7000){
			System.out.print("packet of milk");
		}
		else if(finalTotal >= 5000 && finalTotal<7000){
			System.out.print("pack of 6 Eggs");
		}
		else if(finalTotal >= 3000 && finalTotal<5000){
			System.out.print("1KG of Suger");
		}
		else if(finalTotal <3000){
			System.out.print("No Gift");
		}
		else{
			System.out.println("Invaild Number Entered");
		}
		
	}

		public static void main (String[]args){

        double finalTotal=0;

		Scanner input = new Scanner(System.in);
		int time=0;
		double totalAmount=0;
		
		System.out.print("Enter shopping Time : ");
		time = input.nextInt();
	    
		System.out.print("Enter Total Amount: ");
		totalAmount = input.nextDouble();
		
		finalTotal = calDiscount(time,totalAmount);
		displayGift(finalTotal);
		
		
		
	}
}
