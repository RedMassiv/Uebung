import java.util.Arrays;
public class SelectionSort {

	
static int counter=0;

	public static void main(String[] args) {   // Hauptmethode
		int n=10000; //Anzahl der Arrayfelder
		int list[] = new int[n];   // Array wird angelegt mit der richtigen Anzahl an Feldern
		for (int i=0; i<n; i++){
			double random=Math.random()*1000;
			list[i]=(int)random;
		}
		int list2[] = Arrays.copyOf(list, list.length);
				
		output(list);
		counter=0;
		System.out.println();
		
		selectionSortArray(list);									    // Array wird an die Funktion "SortArray" übergeben
	    
		
		System.out.println("Sortiervorgänge: "+counter);
		System.out.println();
		counter=0;
		bubbleSort(list2);
		System.out.println("Sortiervorgänge: "+counter);
		System.out.println();
		counter=0;
		
		}
	
	
	
	public static void bubbleSort(int[] list){
		System.out.println("BubbleSort");
		int length = list.length-1;
		int temp=0;
		
	for(int j = 0; j<length; length--){	
		
		for(int i =0; i<length; i++){
			
			if(list[i]>list[i+1]){
				temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
				 counter++;
			//	output(list);
			   
			}
		}
			
			
			
		}
	
		
		
		
	}
	
	
	public static void selectionSortArray(int[] array){
		
		System.out.println("SelectionSort");
		
		for(int i=0;i<array.length;i++){     // für jedes Feld des Arrays
	           
	               int minimum = findMinimum(array,i,array.length);  // mit der Funktion "findMinimum" wir die Position der kleinsten Zahl ermittelt und nach "minimum" geschrieben
	           
	           if(i!=minimum){				// wenn eine Zahl gefunden wird, die Kleiner als die, mit der verglichen wird, gefunden wird, werden die Zahlen in der swap Methode getauscht
	        	   swap(array,i,minimum);
	               counter++;
	        	//   output(array);				 // erstmal das ganze Array ausgeben, sieht schön aus (siehe Funktion "output")
		       
	           }
	       }
	   }	
		
	
	
	public static void swap(int[] array, int position1, int position2) {
		int tmp = array[position2]; 		//zwei Zahlen des Array werden getauscht.
		array[position2]=array[position1];
		array[position1]=tmp;
		
		
		 
		
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
	boolean sorted = true;
	int i = 0;
	int endIndex=array.length;
		
		while(sorted && i<endIndex-1){		
			if(array[i]>array[i+1]){ 
				sorted = false;}
			i++;
		}
		// Das müsste noch implementiert werden!
		
		return sorted;
		}

	
	public static void output(int array[]){
		
		for (int i=0; i<array.length; i++){	
			System.out.print(array[i]+",");
			}
		System.out.println("sortiert:"+ isSorted(array));
	//	counter++;
	}
	
}
