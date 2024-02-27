package controller;

public class MdcController {
	
	public MdcController() {
		super();
	}
	
	public int mdc(int x, int y) {
		if(x == y)
			return x;
		else if(x < y)
			return mdc(y, x);
		else
			return mdc(x - y, y);
	}
}
