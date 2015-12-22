
public class quickSort extends sortingAlgorithm{
	int size;
	int[]arr;

	protected quickSort(int size, int[]arr, codeImplementer ci) {
		super(ci);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.arr=arr;
	}

	public void implement() {
		System.out.print("Quick Sort Algorithm: ");
		// TODO Auto-generated method stub
		ci.implementCode(size, arr);
	}

}
