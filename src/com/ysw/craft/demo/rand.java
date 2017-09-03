package com.ysw.craft.demo;

import com.ysw.craft.demo.UTFDemo;
public class rand {
	public static void main(String[] args) { 
		for(int i=0;i<100;i++){ 
			String ss=randStr();
			System.out.print(ss);
			if(i%10==9)
				System.out.println();
		}
	}
	public static String randStr(){
		java.util.Random r=new java.util.Random();
		int t=r.nextInt();
		int t2=r.nextInt();
		int a=0xB0;
		int b=0xA0;
		int tt=t%20+20+a;
		int tt2=t2%47+47+b;
		String s=UTFDemo.gbk(tt*0x100+tt2);
		//System.out.println(s+" "+Integer.toHexString(tt)+" "+Integer.toHexString(tt2)+" "+t2%47); 

		return s;
	}
}
