package lesson;

import java.util.Scanner;

public class EntranceFeeCaculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�܂��N��������Ă���邩��");
		int age = scanner.nextInt();
		System.out.println("���ʂ���͂��Ă�������(�j����M�A������F)");
		String gender = scanner.next();
		
		//�����������g�p����if���œ��ꗿ�𔻒�
		if(age<12 && gender.equals("F")){//F�ȊO����͂����false�ɂȂ�
			//�_����[&&]�@�_���a[||]
			System.out.println("���ꗿ:����");
		}else{
			System.out.println("���ꗿ:�L��");
			}
		scanner.close();
		}
	
}
