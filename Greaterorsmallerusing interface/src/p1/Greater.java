package p1;

public class Greater implements Icompareble {

	@Override
	public int comapare(int x, int y) {
		if(x>y)
			return x;
		return y;
	}

}
