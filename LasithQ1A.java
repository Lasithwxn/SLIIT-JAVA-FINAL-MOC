import java.util.Scanner;
public class LasithQ1A{
	public static void main (String[]args){
		
		Scanner input = new Scanner (System.in);
		String []name = new String[3];
		int [] acountNo= new int [3];
		char [] type = new char [3];
		double [] amount= new double [3];
		
		int i,j,countDeposit=0,countWithdrawal =0;
		double  totalDeposit=0,totalWithdrawal=0,max=0;
		String MDName=" ",MIWName = " ";
		
		for (i=0 ;i<3;i++){
			
			System.out.print("Enter Custormer "+(i+1)+" Name : ");
			name [i] = input.next();
			
			
				System.out.print("Enter Account Number     :");
			acountNo[i]= input.nextInt();
	
			
			System.out.print("Enter Transaction Type   :");
			type [i] = Character.toUpperCase(input.next().charAt(0));
	
				
			System.out.print("Enter Amount             :");
				amount[i] = input.nextDouble();
		
		System.out.println("\n");
			
		}
		
		double min = max;
		
		for (i=0;i<3;i++){
		System.out.printf("%-12s", name[i]);
		}
		System.out.println();
		for (i=0;i<3;i++){
			System.out.printf("%-12d", acountNo[i]);
		}
		System.out.println();
		for (i=0;i<3;i++){
			System.out.printf("%-12c", type[i]);
		}
		System.out.println();
		for(i=0;i<3;i++){
			System.out.printf("%-12.2f",amount[i]);
		}
		System.out.println();
		
		/* for (i=0;i<5;i++){
			System.out.printf("%-10s %-10s %-10s %-12.2f",name [i],acountNo[i],type [i],amount[i]);
			System.out.println();*/
		
		for (i=0; i<3; i++) {
    switch(type[i]) {
        case 'D': 
            totalDeposit = totalDeposit + amount[i];
            countDeposit = countDeposit + 1;

            // Handle first deposit properly
            if (countDeposit == 1 || amount[i] > max) {
                max = amount[i];
                MDName = name[i];
            }
            break;

        case 'W': 
            totalWithdrawal = totalWithdrawal + amount[i];
            countWithdrawal = countWithdrawal + 1;

            // Handle first withdrawal properly
            if (countWithdrawal == 1 || amount[i] < min) {
                min = amount[i];
                MIWName = name[i];
            }
            break;

        default: 
            System.out.println("Invalid Data Entered!");
    }
}

		System.out.println("\n");
			
			System.out.println("Total Deposit Amount is                      : "+totalDeposit);
			System.out.println("Total Withdrawal Amount is                   : "+totalWithdrawal);
			System.out.println("Count of All Deposit Transactions  is        : "+countDeposit);
			System.out.println("Count of All Withdrawal Transactions is      : "+countWithdrawal);
			System.out.println("Maximum Deposit Amount Customer Name is      : "+MDName);
			System.out.print  ("Minimum Withdrawal Amount Customer Name is   : "+MIWName);
			
		
		
	}
}
