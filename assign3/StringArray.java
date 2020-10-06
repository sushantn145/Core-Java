//28.	Initialize one String type of array and print 
//the elements using for each loop.

import java.util.Scanner;
class StringArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.next();
			String ar = arr[i];
			for(int j=0;j<5;j++){
				int min=0;
				if(ar==arr[j]){
					count++;
				}
			}
		}System.out.println(count);
		System.out.println("======================s");
		for(String ar : arr){
			System.out.println(ar);
		}		
	}
}