package charan;
import java.util.Arrays;
import java.util.Scanner;
public class Don {
   public static void main(String[] args) {
	System.out.println("Enter Number:"); 
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	int arr1[]=new int[5];
	arr1[0]=10;
	arr1[1]=20;
	arr1[2]=30;
	arr1[3]=40;
	arr1[4]=50;
//	int arr1[]= {3,5,10,20,50};
//	for(int i=0;i<arr.length;i++) {
//	arr[i]=sc.nextInt();
//	}
	for(int i=0;i<arr.length;i++){ 
	System.out.print(arr[i]+" ");

	}
	System.out.println(Arrays.asList(arr));
	int key=20;
	System.out.println(Arrays.binarySearch(arr, key));
	System.out.println(Arrays.binarySearch(arr,1,5, key));
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.equals(arr, arr1));
	int[][] myNumbers= {{1,2,3,4},{2,3,4}};
	System.out.println(myNumbers[1][2]);
}
}

