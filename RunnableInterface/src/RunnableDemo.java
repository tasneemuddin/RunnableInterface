/**
 * Thread class
 * */
class Class1 implements Runnable {
	
	public void run() {
		show();
	}
	
	public void show() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Class 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * Thread class
 * */
class Class2 implements Runnable {
	
	public void run() {
		show();
	}
	
	public void show() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Class 2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		Class1 cl1 = new Class1();
		Class2 cl2 = new Class2();
		
		Thread obj1 = new Thread(cl1);
		Thread obj2 = new Thread(cl2);
		
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
	}

}

