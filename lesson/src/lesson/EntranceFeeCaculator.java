package lesson;

import java.util.Scanner;

public class EntranceFeeCaculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("まず年齢を教えてくれるかな");
		int age = scanner.nextInt();
		System.out.println("性別を入力してください(男性はM、女性はF)");
		String gender = scanner.next();
		
		//複合条件を使用したif文で入場料を判定
		if(age<12 && gender.equals("F")){//F以外を入力するとfalseになる
			//論理積[&&]　論理和[||]
			System.out.println("入場料:無料");
		}else{
			System.out.println("入場料:有料");
			}
		scanner.close();
		}
	
}
