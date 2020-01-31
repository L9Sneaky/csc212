package tut1;

public class tm {

	public static void main(String[] args) {
		Ex aha = new Ex(15);
		int num[] = aha.getArr();
		util.printArray(num);
		util.ISR(num, 15);
		util.printArray(num);
	}

}
