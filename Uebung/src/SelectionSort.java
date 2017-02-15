
public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] list = {5, 8, 3, 6, 8, 9, 4, 2};
		System.out.println(findMinimum(list, 0, list.length-2));

		}
	
	public static void swap(int[] array, int position1, int position2) {
		
	}
	
	public static int findMinimum(int[] array, int startIndex, int endIndex) {
		 int position = startIndex;
	     int currentMinimum = array[startIndex];
	       
	       for(int i=startIndex+1;i<=endIndex;i++){
	           
	           if(array[i]<currentMinimum){
	               position = i;
	               currentMinimum = array[i];
	           }
	       }
	       
	       return currentMinimum;
	}
			
				
	
	
	public static boolean isSorted(int[] array) {
		
		return true;
		}

	
}
