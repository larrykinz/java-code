import java.util.Scanner;
import java.util.Arrays; 


public class CheckEven {
	public static int[] performAction(int[] evenArray) {

int counter = 0;
for(counter = 0; counter < evenArray.length;counter++) {
 if(evenArray[counter] % 2 == 1)evenArray[counter] = 0;
 else evenArray[counter] = 1;
	}
		return evenArray;
}




	public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);

	
System.out.print("Enter your numbers");
int number = input.nextInt();
int[] array = new int[number];
int counter = 0;
 for(counter = 0; counter < array.length; counter++) {
 System.out.println("Enter number");
 int userInput = input.nextInt();
 array[counter] = userInput;
}
	System.out.print(Arrays.toString(performAction(array)));

}
}	
	r {