class SelectionSort{
	public static void main(String args[]){
		int arr[] = {24,10,5,100,3,45,2};
		System.out.println("Before Selection sort");
		
		for(int a:arr){
			System.out.print(" "+a+" ");	
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++){
			
			int minIndex = i;
			for (int j=i+1;j<arr.length;j++){
				boolean flag=false;
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
				
			
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			System.out.println("Pass : "+arr[i]);
			
			for(int a:arr){
				System.out.print(" "+a+" ");	
			}
			System.out.println();
			
		}
		System.out.println("\nAfter Selection sort");
		for(int a:arr){
			System.out.print(" "+a+" ");	
		}
	}
}