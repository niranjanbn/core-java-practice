package test;
public class Test extends Thread{
	public static void main(String... args){	
		Test a = new Test();
		 a.run();
         System.out.print(a.i);
         a.start();
         System.out.print(a.i);
		       }

	private int i = 0;
    public void run(){
    	System.out.println("printing");
          i++;
    }
}

class Aa implements Runnable{
	private int i;
    public void run(){
          i++;
    }
}