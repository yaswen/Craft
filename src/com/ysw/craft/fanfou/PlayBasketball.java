package com.ysw.craft.fanfou;

import java.util.Random;

public class PlayBasketball {
//	static String aname[]= {"库里","杜兰特","汤普森","格林","伊戈达拉"};
//	static String bname[]= {"威少","乔治","罗伯森","亚当斯","安东尼"};
//	static int aa[]= {3,3,2,1,0};//A队基础攻击
//	static int ap[]= {3,2,0,1,2};//A队转换攻击
//	static int ad[]= {1,2,2,3,2};//A队防守
//	
//	static int ba[]= {1,2,0,1,3};//B队基础攻击
//	static int bp[]= {5,2,1,1,0};//B队转换攻击
//	static int bd[]= {1,2,2,1,0};//B队防守
	
	
	public static void main(String[] args) {
		
		int ts=0,ss=0;
		int aquarter[]= {0,0,0,0};
		int bquarter[]= {0,0,0,0};
		int ascore[] = {0,0,0,0,0};
		int bscore[]= {0,0,0,0,0};
		
		
		
		for(int i = 1 ; i <= 12 ; i++) {
			Teams a=Teams.getTeams(1,i);
			Teams b=Teams.getTeams(2, i);
			String aname[]= a.getName();
			String bname[]= b.getName();
			int aa[]= a.getA();//A队基础攻击
			int ap[]= a.getP();//A队转换攻击
			int ad[]= a.getD();//A队防守
			int ba[]= b.getA();//B队基础攻击
			int bp[]= b.getP();//B队转换攻击
			int bd[]= b.getD();//B队防守
			
			int t=score(aa,ap,ad,aname);
			int s=score(ba,bp,bd,bname);
			

			aquarter[(i-1)/3]+=t;
			bquarter[(i-1)/3]+=s;
			ts+=t;
			ss+=s;
			System.out.println(t+"\t"+s);
			if(i%3==0) {
				System.out.println("第"+(i/3)+"节的比分为："+aquarter[(i-1)/3]+"比"+bquarter[(i-1)/3]+"。");
			}
		}
		System.out.println("最终比分为："+ts+"比"+ss+"！四节比分分别为："
				+aquarter[0]+"-"+bquarter[0]+"，"
				+aquarter[1]+"-"+bquarter[1]+"，"
				+aquarter[2]+"-"+bquarter[2]+"，"
				+aquarter[3]+"-"+bquarter[3]+"，");
		
	}
	
	
	public static int score(int a[],int p[],int db[],String aname[]) {
		int s=0;
		for(int i=0;i<5;i++) {
			int si=atk(a[i],p[i],db[i]);
			System.out.print(aname[i]+"得分"+si+"\t");
			s+=si;
		}
		return s;
	}
	public static int basescore(int a[],int p[],int db[],String aname[]) {
		int s=0;
		for(int i=0;i<5;i++) {
			int si=atk(a[i],p[i],db[i]);
			System.out.print(aname[i]+"得分"+si+"\t");
			s+=si;
		}
		return s;
	}
	public static int atk(int a,int p,int d) {
		Random r=new Random();
		int s=0;
		s=a;
		int pp=r.nextInt()%(p+1);
		s+=(pp<0?-pp:pp);
		int dd=r.nextInt()%(d+4);
		s-=(dd<0?0:dd);
		
		//System.out.print("得分"+(s<0?0:s)+"\t");
		return s<0?0:s;
	}
/*
 *	比赛分四节，每节分三个小节，基本上篮球比赛一节12分钟时间分为三个4分钟的小段很常见。
 *	玩家可以为每个小节布置战术及阵容，这是之前考虑好的一些规则，既简单，又模拟了NBA真实情况。
 *	在每个小节里，可能有球员发动自己的技能，如果没有球员发动技能，那就是普通得分，即把每个球员的基础得分相加之类。
 *	普通得分计算公式是球员基础进攻+转换进攻×一定概率比例-对位球员防守×一定概率比例
 *		因为球员基础进攻是球员的基本功，可以稳稳得分。
 *			当然如果某位球员发动了技能，那么其队友的基础进攻当然也就不需要了。
 *			例如汤普森进入了汤神模式，那队友库里肯定会积极给他喂球，自己基本不出手。
 *		转换进攻要看运气，不一定每节都有。
 *			后续可以设定战术，根据球队打法去改变球队的基础得分和转换得分的比例。
 *			比如球队里都是转换进攻高手，则可以加大转换进攻比例，如果运气好，可以得高分，运气不好，不仅没得高分，防守强度降低并且体力消耗大。
 *		防守也需要看状态，比如有时候乐福就是防守漏勺，但在总决赛上的防守却可圈可点。
 *	
 *	一般的球员的技能可能有几种：
 *		XX%概率本小节连得XX分。一般为神经刀或者巨星得分手，如库里、JR史密斯、汤普森。
 *		XX%概率本小节获得阵容中所有队友的快攻得分总和的几倍。一般为擅长打转换进攻的球员如威少、连长、詹姆斯。
 *		XX%概率本小节让阵容中所有队友基础得分各加2分，一般为善于串联队友的球员如隆多、保罗、格林。
 *		XX%概率本小节让阵容中某一队友获得其快攻得分的几倍得分，一般为擅长串联队友打转换进攻的球员如基德、乐福、卢比奥。
 *		XX%概率让对手本小节仅能依靠基础得分进行得分，一般为擅长防守的球员如阿里扎、伦纳德、戈贝尔。
 *	球员能力值大概：
 *		假设五人不考虑体力，能力中游，防守中游，打满一场应该得100-120分左右，按110分算。
 *		那么相当于每人22分，则12个小节平均每人每小节1.83分
 *		对位防守期望假设是1（有一定概率为0，最好可以设计为正态分布）。
 *		则平均基础进攻+转换进攻期望=2.83。这种球队类似黄蜂、掘金、爵士，没有超级巨星，阵容实力平均。
 *		但是如果是勇士、骑士这类巨头球队，替补又好，不可能巨头一多，场均得分就140吧，因此应加入球权机制：
 *			一套阵容平均进攻能力值太高，按比例削弱，如果有了体力机制，球权机制削弱了进攻，可以加强体力，这样多出来的体力可以加大防守的效果。
 *		一期先不做体力、不做球权，只要计算双方得分，勇士这类球队自然要比篮网和湖人赢的概率大，这不太平衡了。没办法，这就是篮球。
 *		体力有一种新想法，每个球员，仅以一个数值表示体力，例如哈登体力为8，他就只能打8小节，如果安排哈登上了超过8小节，到第9小节时候所有数据大幅下滑。
 *		
 *	一期目标：
 *		打满一场应该得平均110分左右，大部分分布在90-125分左右，小概率出现50-160分，其余范围不应出现。
 *		不同队伍拥有不同阵容
 *		12个小节有不同的阵容
 *
 *		上述简版体力/模拟定死轮换
 * */
}
