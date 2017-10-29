package com.ysw.craft.fanfou;


public class Teams {
	
	
	public String name[];
	public int a[];
	public int p[];
	public int d[];
	
	
	
	
	
	
	
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public int[] getP() {
		return p;
	}
	public void setP(int[] p) {
		this.p = p;
	}
	public int[] getD() {
		return d;
	}
	public void setD(int[] d) {
		this.d = d;
	}
	public static Teams getTeams(int teamId,int quarterId) {
		Teams teams=new Teams();
		Team team=Team.getTeam()[teamId];
		
		//判断小节模块
		if(quarterId<8) {
			int a[]=new int[5];
			int p[]=new int[5];
			int d[]=new int[5];
			String n[]=new String[5];
			for(int i=0;i<5;i++) {
				a[i]=team.players[i].getA();
				p[i]=team.players[i].getP();
				d[i]=team.players[i].getD();
				n[i]=team.players[i].getName();
			}
			teams.setA(a);
			teams.setD(d);
			teams.setP(p);
			teams.setName(n);
		}else {
			int a[]=new int[5];
			int p[]=new int[5];
			int d[]=new int[5];
			String n[]=new String[5];
			for(int i=0;i<5;i++) {
				a[i]=team.players[i+5].getA();
				p[i]=team.players[i+5].getP();
				d[i]=team.players[i+5].getD();
				n[i]=team.players[i+5].getName();
			}
			teams.setA(a);
			teams.setD(d);
			teams.setP(p);
			teams.setName(n);
		}
		return teams;
	}
}
