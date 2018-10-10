
public class Demo2 {
	
	static int x =10;
	int y=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println(x);
		Demo2 d1 = new Demo2();
		System.out.println(x);
		System.out.println(d1.y);
		d1.x=888;
		d1.y=999;
		
		System.out.println(x);
		System.out.println(d1.y);
		
		Demo2 d2 = new Demo2();
		System.out.println(d2.x);
		System.out.println(d2.y);
	}

	
}
