class c1 extends Thread{
	public void run(){
		System.out.println("Hello");
	}
}
class c2 extends Thread{
	public void run(){
		System.out.println("World");
	}
}
class c3 extends Thread{
	public void run(){
		System.out.println("Mfs");
	}
}

public class threadingprac{
	public static void main(String[] args){
		c1 ob1 = new c1();
		c2 ob2 = new c2();
		c3 ob3 = new c3();
		ob1.start();
		ob2.start();
		ob3.start();
	}
}