
public class Task04 {

	public static void main(String[] args) {
		int x = 10;
	    int y = 20;
	    
	    System.out.println("before swapping numbers");
	    System.out.println(x);
	    System.out.println(y);


	    x = x + y;
	    y = x - y;
	    x = x - y;
	    System.out.println("After swapping");
	    System.out.println(x);
	    System.out.println(y);
	}

}
