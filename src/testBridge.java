
public class testBridge {
	public static void main(String[] args){
		int[] r= {4,5,6,3,1};
		sortingAlgorithm mergeSort1= new mergeSort(5,r, new javaImplementation());
		sortingAlgorithm quickSort1= new quickSort(5,r, new javaImplementation());
		sortingAlgorithm mergeSort2= new mergeSort(5,r, new cppImplementation());
		sortingAlgorithm quickSort2= new quickSort(5,r, new cppImplementation());
		
		mergeSort1.implement();
		quickSort1.implement();
		mergeSort2.implement();
		quickSort2.implement();
	}

}
