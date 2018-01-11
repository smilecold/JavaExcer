
package test;

public class test {
	public static int i = 0;
	public static int j = 0;
	public static void main(String[] args) {
		Run1 r1 = new Run1();
		Run2 r2 = new Run2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
	
}
class Run1 implements Runnable{

	@Override
	public void run() {
		for (; test.i < 10; test.i++) {
			System.out.println(test.i);
		}
		
	}
	
}
class Run2 implements Runnable{
	@Override
	public void run() {
		while (test.i<10) {
			if(test.i>test.j) {
				System.out.println("------"+test.i);
				test.j=test.i;
			}
		}
	}
}