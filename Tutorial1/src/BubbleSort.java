import java.util.Scanner;
public class BubbleSort {
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
	    bubblesort(arr); 
	    printArray(arr);
	}

	public static int[] bubblesort(int[] A)
{
	for(int i = 0; i< A.length-1 ; i++){
		
		for(int j = 0; j< A.length-1-i ; j++){
		if(A[j] > A[j+1])
				
		{
			
		int temp = A[j+1];
		A[j+1] = A[j];
		A[j] = temp;
	}

}}	return A;	
	}
private static void printArray(int[] A) {
	for (int i =0; i< A.length ; i++){
	System.out.println(A[i]);		
	}
}	}
