package com.ysw.craft.fanfou;


public class Teams {
	
	public static Team beTeam(String tname) {
		
		Team t=new Team();
		switch(tname){
			case "勇士":
				String n[]={"库里","汤普森","伊戈达拉","杜兰特","格林"};
				t.setName(n);
				int a[]={3,2,0,3,1};
				t.setA(a);
				int p[]= {3,0,2,2,1};
				t.setP(p);
				int d[]= {1,2,2,2,3};
				t.setD(d);
				break;
			case "雷霆":
				
		}
		return t;
		
	}
	Team team=new Team();
	
}
