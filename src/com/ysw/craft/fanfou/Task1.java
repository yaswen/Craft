package com.ysw.craft.fanfou;

public class Task1 {
	public static void main(String[] args) {  
        // run in a second  
        final long timeInterval = 1000;  
        Runnable runnable = new Runnable() {  
            public void run() {  
                while (true) {  
                    // ------- code for task to run  
                    System.out.println("Hello !!");  
                    System.out.println(PlayBasketball.atk(1,2,3));
                    // ------- ends here  
                    try {  
                        Thread.sleep(timeInterval);  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
            }  
        };  
        Thread thread = new Thread(runnable);  
        thread.start();  
    } 
}
