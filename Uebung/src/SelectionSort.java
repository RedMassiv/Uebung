import java.lang.reflect.Array;

public class SelectionSort {
	
	public static void main(String[] args) {   // Hauptmethode
		
		int[] list = {5, 8, 3, 6, 8, 9, 4, 2,10, 574,0,5};   // Array wird angelegt
		sortArray(list);									 // Array wird an die Funktion "SortArray" übergeben
		

		}
	
	
	public static void sortArray(int[] array){
		for(int i=0;i<array.length;i++){     // für jedes Feld des Arrays
	           
	           output(array);				 // erstmal das ganze Array ausgeben, sieht schön aus (siehe Funktion "output")
	           int minimum = findMinimum(array,i,array.length);  // mit der Funktion "findMinimum" wir die Position der kleinsten Zahl ermittelt und nach "minimum" geschrieben
	           
	           if(i!=minimum){				// wenn eine Zahl gefunden wird, die Kleiner als die, mit der verglichen wird, gefunden wird, werden die Zahlen in der swap Methode getauscht
	           swap(array,i,minimum);
	           }
	       }
	   }	
		
	
	
	public static int swap(int[] array, int position1, int position2) {
		int tmp = array[position2]; 		//zwei Zahlen des Array werden getauscht.
		array[position2]=array[position1];
		array[position1]=tmp;
		return position1;
		
		 
		
	}
	
	public static int findMinimum(int[] array, int startIndex, int endIndex) {
		 int position = startIndex;
	     int currentMinimum = array[startIndex];
	       
	       for(int i=startIndex+1;i<endIndex;i++){
	           
	           if(array[i]<currentMinimum){    //die eigentliche Magie: Finde die kleinste Zahl im Array
	               position = i;
	               currentMinimum=array[i];
	           }
	       }
	       
	       return position;
	}
			
				
	
	
	public static boolean isSorted(int[] array) {
													// Das müsste noch implementiert werden!
		return true;
		}

	
	public static void output(int array[]){
		
	for (int i=0; i<array.length; i++){	
		System.out.print(array[i]+",");
	}
	System.out.println("");
	}
	
}
