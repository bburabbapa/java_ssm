import java.util.Scanner;

public class JA0904_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int random = (int) (Math.random() * 100) + 1;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scan.nextInt();

		if (random == num1) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}

		System.out.println("두번째 숫자를 입력하세요");
		num2 = scan.nextInt();
		if (random == num2) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}

		System.out.println("첫번째 숫자를 입력하세요");
		num3 = scan.nextInt();

		if (random == num3) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}

	}

}
