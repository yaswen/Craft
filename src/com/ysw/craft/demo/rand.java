package com.ysw.craft.demo;

import com.ysw.craft.demo.UTFDemo;
public class rand {
	public static void main(String[] args) { 
		quming("杨");
	}
	public static void quming(String xing){
		for(int y=0;y<100;y++){
			System.out.print(xing+randStr()+randStr()+"\t");
			if(y%10==9){
				System.out.println();
				System.out.println();
			}
			}
	}
	public static void rand1000(){
		for(int i=0;i<1000;i++){ 
			String ss=randStr();
			
			System.out.print(ss);
			if(i%33==32)
				System.out.println();
		}
	}
	public static String randStr(){
		java.util.Random r=new java.util.Random();
		int t=r.nextInt();
		int t2=r.nextInt();
		int a=0xAf;
		int b=0xA0;
		int tt=t%20+20+a;
		int tt2=t2%47+47+b;
		String s=UTFDemo.gbk(tt*0x100+tt2);
		//System.out.println(s+" "+Integer.toHexString(tt)+" "+Integer.toHexString(tt2)+" "+t2%47); 

		return s;
	}
}
