//package CASE_STUDY;
//
//public class FantasyRolePlayingGame {
//
//	FantasyRolePlayingGame() {
//
//		System.out.println("no");
//
//	}
//
//	FantasyRolePlayingGame(Character1 chr) {
//		System.out.println(chr.hs.maxhealth);
//	}
//
//	void main() {
//		Character1 chr= new Character1();
//		FantasyRolePlayingGame c = new FantasyRolePlayingGame(chr);
//	}
//
//}
//
//class Character1 {
//	String name;
//	int level;
//	HealthStatus hs = new HealthStatus();
//
//}
//
//class HealthStatus {
//
//	int currenthealth;
//	int maxhealth=250;
//
//}

//package CASE_STUDY;
//
//public class FantasyRolePlayingGame {
//
//	String playername;
//	int playerlevel;
//	Health playerhealth;
//
//	FantasyRolePlayingGame(Person p1) {
//		this.playername = p1.name;
//		this.playerlevel = p1.level;
//		this.playerhealth = p1.health;
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Main Method !!!!!!!!!!");
//
//		Person original = new Person();
//		Person duplicate = new Person();
//
//	}
//}
//
//class Person {
//	String name;
//	int level;
//	Health health = new Health();
//
//}
//
//class Health {
//
//	int currenthealth;
//	int maxhealth;
//}

package com.case_study;
public class FantasyGame {
	String playername;
	int playerlevel;
	Health health;
	FantasyGame(PlayerInfo originalplayer) {
		this.playername = originalplayer.playername;
		this.playerlevel = originalplayer.playerlevel;
		this.health = originalplayer.health;
	}
	FantasyGame(FantasyGame duplicateplayer) {
//		this.playername = duplicateplayer.playername;
//		this.playerlevel = duplicateplayer.playerlevel;
		this.health = duplicateplayer.health;
	}

	public static void main(String[] args) {
		PlayerInfo player1 = new PlayerInfo();
		FantasyGame originalplayer = new FantasyGame(player1);
		FantasyGame duplicateplayer = new FantasyGame(originalplayer);
		System.out.println(originalplayer.playername);
		System.out.println(duplicateplayer.playername);
		System.out.println(originalplayer.health);
		System.out.println(duplicateplayer.health);
	}}

class PlayerInfo {
	String playername = "Jaya";
	int playerlevel = 70;
	Health health = new Health();

}
class Health {
	int currenthealth = 10;
	int maxhealth = 250;
}
