
public class demo1 {

	demo1 get() {
		return this;
	}

}

class demo2 extends demo1 {

	protected demo2 get() {  
		return this;
	}

}
