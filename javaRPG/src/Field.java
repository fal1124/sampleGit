import java.util.Scanner;

public class Field {
	public static void main(String[] args) {
		String name ="sample";
		int hp =30;
		int attack = 5;
		int defence = 6;

		String Ename ="sample2";
		int Ehp =23;
		int Eattack = 2;
		int Edefence = 2;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("1,2,3�ǂꂩ�̐�������͂��Ă��������B");
			int num = sc.nextInt();
			switch(num){
			case 1:
				hp=+hp;
				System.out.println(hp+"�̗͂��񕜂����B");
				break;
			case 2:
				System.out.println(Ename+"�����ꂽ�B");
				while(true){
					if(Ehp!=0){
						System.out.println(name+"�̍U��");
						int damage = attack-Edefence;
						int damagere =(int)(Math.random()*damage)+4;
						System.out.println(damagere+"�̃_���[�W��^�����B");
						Ehp=Ehp-damage;
					}
					if(Ehp<=0){
						System.out.println(Ename+"�͓|�ꂽ");
						break;
					}
				}
				break;
			}
		}
	}

}
