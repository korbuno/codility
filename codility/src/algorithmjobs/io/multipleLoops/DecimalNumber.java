package algorithmjobs.io.multipleLoops;

//����
//�ڿ���n,m�� �־��� ��, n����m���� �����ϴ� �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͽ���. ���⼭ �Ҽ���, ����� 1�� �ڱ��ڽŹۿ� �������� �ʴ� ���� ���Ѵ�.
//
// 
//
//�Է�
//ù° �ٿ� �ڿ��� n, m�� �־�����. (1��n,m��20,000)
//
// 
//
//���
//ù° �ٿ� n����m���� �����ϴ� �Ҽ��� ��� ����Ѵ�.
//
// 
//
//���� �Է�
//1 10
//���� ���
//2 3 5 7 
// 
//
//���� �Է�
//13 30
//���� ���
//13 17 19 23 29

import java.util.Scanner;

public class DecimalNumber {

	public static void main(String[] args) {
		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean flag = true;

		if (n <= 2)
			n = 2;

		for (int i = n; i <= m; i++) {
			flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}

}
