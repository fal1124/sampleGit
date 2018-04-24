
import java.util.Scanner;

public class CreateHero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//名前入力をする
	System.out.println("名前を入力してください。");
	String name =sc.nextLine();
		
		//ステータスを作成する（試しに乱数で）
		//hp
		int hp =(int)(Math.random()*29)+10;
		//攻撃力
		int attack =(int)(Math.random()*4)+5;
		//防御力
		int defence =(int)(Math.random()*3)+2;
		//すばやさ
		int speed =(int)(Math.random()*2)+8;
		
		//結果を表示
		System.out.println("ようこそ"+name+"さん");
		System.out.println(name+"さんのステータス");
		System.out.println("HP:"+hp);
		System.out.println("ATTACK:"+attack);
		System.out.println("DEFENCE:"+defence);
		System.out.println("SPEED:"+speed);
		
		
	}

}
