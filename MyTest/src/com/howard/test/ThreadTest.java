package com.howard.test;

public class ThreadTest {
	
	private static Runnable runnable=null;
	public static void main(String[] args) {
		final int k=0;
	    runnable = new Runnable() {
			
			@Override
			public void run() {
				synchronized (runnable) {
					for (int i=0;i<100;i++){
						System.out.println("i:"+i);
					}
				}
			}
		};
		Thread t1=new Thread(runnable);
	    Thread t2=new Thread(runnable);
	    t1.start();
	    t2.start();
	}
		
	
    
	
	
}
