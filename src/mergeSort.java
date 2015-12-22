
public class mergeSort extends sortingAlgorithm{
	int size;
	int[]arr;

	protected mergeSort(int size, int[]arr, codeImplementer ci) {
		super(ci);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.arr=arr;
	}

	public void implement() {
		System.out.print("Merge Sort Algorithm: ");
		// TODO Auto-generated method stub
		ci.implementCode(size, arr);
	}

}
