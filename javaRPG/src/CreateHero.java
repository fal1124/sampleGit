
import java.util.Scanner;

public class CreateHero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//���O���͂�����
	System.out.println("���O����͂��Ă��������B");
	String name =sc.nextLine();
		
		//�X�e�[�^�X���쐬����i�����ɗ����Łj
		//hp
		int hp =(int)(Math.random()*29)+10;
		//�U����
		int attack =(int)(Math.random()*4)+5;
		//�h���
		int defence =(int)(Math.random()*3)+2;
		//���΂₳
		int speed =(int)(Math.random()*2)+8;
		
		//���ʂ�\��
		System.out.println("�悤����"+name+"����");
		System.out.println(name+"����̃X�e�[�^�X");
		System.out.println("HP:"+hp);
		System.out.println("ATTACK:"+attack);
		System.out.println("DEFENCE:"+defence);
		System.out.println("SPEED:"+speed);
		
		
	}

}
