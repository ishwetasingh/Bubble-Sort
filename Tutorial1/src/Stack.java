import java.util.Scanner;

public class Stack {

public static void main(String[] args) 
{	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of elements: " );
	int n = s.nextInt();
	int arr[]= new int[n];
	
	System.out.println("enter elements");

    for(int i=0;i<n;i++){				//for reading array
        arr[i]=s.nextInt();
    }

    for(int i: arr){ 					//for printing array
        System.out.println(i);
    }

}



}
