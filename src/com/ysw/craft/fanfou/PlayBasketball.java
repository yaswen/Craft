package com.ysw.craft.fanfou;

import java.util.Random;

public class PlayBasketball {
	static String aname[]= {"库里","杜兰特","汤普森","格林","伊戈达拉"};
	static String bname[]= {"哈登","保罗","阿里扎","安德森","卡佩拉"};
	static int a[]= {5,5,3,1,2};
	static int b[]= {5,3,2,3,2};
	static int da[]= {1,4,2,4,2};
	static int db[]= {1,3,4,1,4};
	public static void main(String[] args) {
		Random r=new Random();
		int ts=0,ss=0;
		int aquarter[]= {0,0,0,0};
		int bquarter[]= {0,0,0,0};
		for(int i = 1 ; i <= 12 ; i++) {
			int t=score(a,db);
			int s=score(b,da);
			
//			int t=r.nextInt()%(a[0]+5)+8+a[0];
//			int s=r.nextInt()%(b[0]+5)+8+b[0];
			aquarter[(i-1)/3]+=t;
			bquarter[(i-1)/3]+=s;
			ts+=t;
			ss+=s;
			System.out.println(t+"\t"+s);
			if(i%3==0) {
				System.out.println("第"+(i/3)+"节的比分为："+aquarter[(i-1)/3]+"比"+bquarter[(i-1)/3]+"。");
			}
		}
		System.out.println("最终比分为："+ts+"比"+ss+"！");
		
	}
	
	
	public static int score(int a[],int db[]) {
		int s=0;
		for(int i=0;i<5;i++) {
			s+=atk(a[i],b[i]);
		}
		return s;
	}
	public static int atk(int a,int b) {
		Random r=new Random();
		int s=0;
		s=r.nextInt()%(a+2)+a+8-b;
		return s;
	}
}
