package com.ysw.craft.fanfou;

import com.ysw.craft.demo.txttest;

public class Team {
	
	public static void main(String[] args) {
		getTeams("雷霆");
	}
	public String name;
	public Player[] players;
	int lineUp[][];
	
	public int[][] getLineUp() {
		return lineUp;
	}

	public void setLineUp(int[][] lineUp) {
		this.lineUp = lineUp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public static Team getTeams(String tname) {
		Team team=new Team();
		String t1=txttest.basketballfile().split("&")[3];
		String p1=t1.split("\n")[3];
		String pn1=p1.split(" ")[0];
		System.out.println(p1);
		return team;
		
	}
}
