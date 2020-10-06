//27.	Write a program to fine the smallest and greatest
 //number present in the array of integer type.

class SmallGreat{
	public static void main(String args[]){
	int arr[] = new int[]{10,15,17,90,1,36,2,50,40};
	int min=arr[0];
	int max=0;
	/*for(int i=0;i<arr.length;i++){
		if(min>arr[i]){
			min=arr[i];
		}
		max=arr[i];		
	}*/
	for(int a:arr){
		if(min>a){
			min=a;
		}
		if(max<a){
			max=a;
		}	
	}
	System.out.println("Min = "+min);
	System.out.println("Min = "+max);
	}
}