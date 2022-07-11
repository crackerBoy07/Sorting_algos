public class Bubble_sort {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		} 
	}
}

	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 4, 9, 7};
		Bubble_sort bs = new Bubble_sort();
		bs.printArray(arr);
		bs.sort(arr);
		bs.printArray(arr);
	}
}
