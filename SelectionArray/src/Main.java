//Stephen Gordon
public class Main {
	public static void main(String args[]){
		int[] myArray = {5,321,42,532,5324,132,562,631,412,321};
		System.out.println("Unsorted");
		print(myArray);
		System.out.println("Sorted via selection sort");
		//selectionSort(myArray);
		insertionSort(myArray);
		print(myArray);
		int[] newArray = copy(myArray);
		System.out.println("New array merged with a copy of itself");
		int[] newNewArray = mergeArrays(myArray, newArray);
		print(newNewArray);
		System.out.println("New array now sorted");
		insertionSort(newNewArray);
		print(newNewArray);
	} //end method
	
	public static void selectionSort(int[] array){
		int size = array.length;
		int min;
		int temp;
		for(int i = 0; i<size-1; i++){
			min = i;
			for(int j = i+1; j<size; j++){
				if(array[j] < array[min]){ //J moves to other spots in array to check if smaller than the min
					min = j; //Sets min to j to do the if statement below
				} //end if
			}//end for
			if(min != i){ //Swaps the two numbers in the array
				temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			} //end if
		}//end for
	} //end method
	
	public static void insertionSort(int[] array){
		int pos;
		int value;
		
		for(int i=1; i<array.length;i++){ //Start at 1 because no point to check the first, and allows to move backward
			value = array[i]; //Value being inserted
			pos = i; // Position in the array
			while(pos > 0 && array[pos-1] > value){ //If pos>0 and the number behind the position is still greater than value
				array[pos] = array[pos-1];
				pos = pos-1;
			} //end while
			array[pos] = value;
		}//end for
	}//end method
	
	public static int[] copy(int[] input){
		int[] output = new int[input.length];
		for(int i = 0; i<input.length; i++){
			output[i] = input[i];
		}//end for
		return output;
	}//end method
	
	public static int[] mergeArrays(int[] first, int[] second){
		int[] result = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		for(i=0; i<first.length; i++){
			result[i] = first[i];
		}//end for
		for(j=0; j<second.length; j++){
			result[i] = first[j];
			i++;
		}//end for
		return result;
	} //end method
	
	public static void print(int[] array){
		int count = 0;
		while(count != array.length){
			System.out.print(array[count] + " ");
			count++;
		} //end while
		System.out.println();
	} //end method	
	
}
