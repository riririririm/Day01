import java.util.Scanner;

public class Day_01_5 {

	public static void main(String [] args) {
		/*
		 * int n1 = 10; int n2 = 3; int r1 =n1/n2; int r2 = n1%n2;
		 * System.out.println(r1); System.out.println(r2);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("물건의 합계:");
		int cost = sc.nextInt();
		System.out.println("손님이 낸 돈:");
		int money = sc.nextInt();
		int charge = money-cost;
		
		
		if(charge<0) { System.out.println("돈이 부족"); System.exit(0); }
		 
		System.out.println("거스름돈:"+charge);
		
		
		int m =charge/10000;
		charge =(charge-m*10000);
		int c = charge/1000;
		charge =(charge-c*1000);
		int b = charge/100;
		charge =(charge-b*100);
		int s = charge/10;
		
		System.out.println("만원:"+m+" 천원:"+c+" 백원:"+b+" 십원:"+s);
		
		
	}
}
