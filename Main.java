public class Search{
	// Searches for a target integer x in the first n elements of
	// an array list arr through recursion.

	static int EasySearch(int arr[], int left, int n, int x){
		if (n >= left){
			int mid = left + (n-left) / 2;

			if (arr[mid] == x){
				return mid;
			}

			// if middle element is smaller than x,
			// find x in the left sub-array
			if(arr[mid] > x){
				return EasySearch(arr, left, mid-1, x);
				
			}

			// if middle element is larger than x,
			// find x in the right sub-array
			return EasySearch(arr, mid+1, n, x);
		}
		// if element is not present, return
		return -1;
		}

	public static void main(String args[]){
		// n is the given range to search the target integer
		// i.e, find the target integer up to the nth place
		Search search = new Search();
		int arr[] = { 1, 4, 5, 6, 9, 10, 12, 15, 22, 35 };
		int n = 8;
		int target = 12;
		int result = search.EasySearch(arr,0,n-1,target);
		if (result == -1){
			System.out.println("Element not found in range.");
		}
		else{
			System.out.println("Element found at index " + result);
		}
	}
}
