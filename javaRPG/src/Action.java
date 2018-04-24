
public class Action {
  public static void main(String[] args) {
	String name ="sample";
	int hp =30;
	int attack = 5;
	int defence = 6;
	
	
	String Ename ="sample2";
	int Ehp =23;
	int Eattack = 2;
	int Edefence = 2;
	
	System.out.println(name+"の攻撃");
	int damage = attack-Edefence;
	int damagere =(int)(Math.random()*damage)+4;
	System.out.println(damagere+"のダメージを与えた。");
}
}
