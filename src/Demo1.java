
public class Demo1 {
	
	private int x,y;
	
	
	public void setNum() {
		x=10;
		y=20;
		
	}
	public void getNum() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Demo1 one = new Demo1();
		one.setNum();
		one.getNum();

	}

}
