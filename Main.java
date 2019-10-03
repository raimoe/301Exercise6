public class Search{
	// Searches for a target integer x in the first n elements of
	// an array list arr through recursion.

	static int EasySearch(int arr[], int left, int right, int x){
		if (right >= 1){
			int mid = (left + (right-left)) / 2;

			if (arr[mid] == x){
				return mid;
			}

			// if middle element is smaller than x,
			// find x in the right sub-array
			if(arr[mid] < x){
				left = mid;
				EasySearch(arr,mid+1,right,x);
			}

			// if middle element is larger than x,
			// find x in the left sub-array
			EasySearch(arr,left,mid-1,x);
		}
		// if element is not present, return
		return -1;
		}

	public static void main(String args[]){
		Search search = new Search();
		int arr[] = { 1, 4, 5, 6, 9, 10, 22, 25 };
		int length = arr.length;
		int target = 4;
		int result = search.EasySearch(arr,0,length,target);
		if (result == -1){
			System.out.println("Element not found in range.");
		}
		else{
			System.out.println("Element found at index " + result);
		}
}
