import java.util.Scanner;
public class  LasithQ1B{
	public static void main (String[]args){
		
	    char colorSearch=' ';
		int n=3;
		Scanner input = new Scanner(System.in);
		char[][] color = new char [n][n];
		
		
		for (int i=0;i<n;i++){
			
			for (int j=0;j<n;j++){
				System.out.print("Enter Color Position ["+i+","+j+"] : ");
				color[i][j] = Character.toUpperCase(input.next().charAt(0));
				
			}
			System.out.println("\n");
		}
		
		System.out.println("LED Panel Visual Display:");
		
		for(int i=0;i<n;i++){
			
		for (int j=0; j<n;j++){
			System.out.print(color[i][j]);
		}
		System.out.println();
	}
		
		System.out.print("Select a Color (R, G, or B) to display all locations : ");
	    colorSearch = Character.toUpperCase(input.next().charAt(0));
		
		System.out.println("\n");
		System.out.print("Location of All Red LED Bulbs are  : ");
		for (int i = 0;i<3;i++){
			for (int j = 0; j<3;j++){
				if (color[i][j] == colorSearch){
					System.out.print("["+i+","+j+"] ");
					
				}
			}
		}
		
	}
}