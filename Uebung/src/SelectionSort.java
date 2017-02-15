import java.lang.reflect.Array;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] list = {5, 8, 3, 6, 8, 9, 4, 2,10, 574,0,5};
		sortArray(list);
		

		}
	
	
	public static void sortArray(int[] array){
		for(int i=0;i<array.length;i++){
	           
	           output(array);
	           int minimum = findMinimum(array,i,array.length);
	           
	           if(i!=minimum){
	           swap(array,i,minimum);
	           }
	       }
	   }	
		
	
	
	public static int swap(int[] array, int position1, int position2) {
		int tmp = array[position2];
		array[position2]=array[position1];
		array[position1]=tmp;
		return position1;
		
		 
		
	}
	
	public static int findMinimum(int[] array, int startIndex, int endIndex) {
		 int position = startIndex;
	     int currentMinimum = array[startIndex];
	       
	       for(int i=startIndex+1;i<endIndex;i++){
	           
	           if(array[i]<currentMinimum){
	               position = i;
	               currentMinimum=array[i];
	           }
	       }
	       
	       return position;
	}
			
				
	
	
	public static boolean isSorted(int[] array) {
		
		return true;
		}

	
	public static void output(int array[]){
		
	for (int i=0; i<array.length; i++){	
		System.out.print(array[i]+",");
	}
	System.out.println("");
	}
	
}
