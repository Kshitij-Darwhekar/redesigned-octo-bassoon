
public class Demo<Z> {

	private Z data;
	//private Object data;

	public Demo(Z data) {
	this.data = data;	
	}

	public Z getData() {
		return (Z) data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	
	public static void main(String[] args) {
		Demo<Integer> d1 = new Demo<Integer>(100);
		System.out.println(d1.getData());
		
		Demo d2 = new Demo("Hello");
		System.out.println(d2.getData());
	}
	
}
