package tut1;

public class SE<T> implements Condition<T> {

	@Override
	public boolean test(T data) {
		return Math.floorMod((int) data, 2) == 0;
	}

}
