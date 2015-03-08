import java.util.Scanner;

public class InsertionSort {

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
	    sort(arr); 
	    printArray(arr);
	}

	public static int[] sort(int[] A){
	for(int i =1; i< A.length ; i++){
		int key = A[i];
		int j = i-1;
		
		while(j>=0 && A[j]>key)
		{
			A[j+1]=A[j];
			j--;
			}
		
		A[j+1]=key;
	}
	return A;
}
	private static void printArray(int[] A) {
	for (int i =0; i< A.length ; i++){
	System.out.println(A[i]);		
	}}}		
		/*System.out.println("Enter your name: " );
		 String name =s.next();
		 
	      System.out.println("Enter first number: ");
	      int firstNumber = s.nextInt();
	      System.out.print("Enter second number: ");
	      int secondNumber = s.nextInt();
	      
	      
	      
	      
	      int sum = firstNumber + secondNumber;
	      System.out.println("The result of addition is " + sum);
	}*/


