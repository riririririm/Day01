import java.util.Scanner;

public class Day01_4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("이름입력하세요"); String name = sc.next();
		 * 
		 * System.out.println("나이입력하세요"); int age = sc.nextInt();
		 * 
		 * System.out.println("name:"+name); System.out.println("age:"+age);
		 */
		
		System.out.println("희망월급입력하세요");
		int money = sc.nextInt();
		double a,b,c,d, total;
		a=money*0.003;
		b=money*0.005;
		c=money*0.002;
		d=money*0.012;
		total=a+b+c+d;
		
		System.out.println("국민연금:"+a);
		System.out.println("고용보험:"+b);
		System.out.println("의료보험:"+c);
		System.out.println("산재보험:"+d);
		System.out.println("총 세금의 합계:"+total);
		System.out.println("실수령액:"+(money-total)+"원");
		
	}

}
