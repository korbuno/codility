package algorithmjobs.io.multipleLoops;
//����

//n���� �ﰢ���� ����ϴ� ���α׷��� �ۼ��Ͽ���. Input, Output�� ������ �����Ѵ�.
//
// 
//
//�Է�
//ù° �ٿ� ����n�� �־�����. (0��n��100)
//
// 
//
//���
//���� ������ ���� �ﰢ�� ������� ��*���� ����Ѵ�.
//
// 
//
//���� �Է�
//3
//���� ���
//  *
// ***
//*****
// 
//
//���� �Է�
//6
//���� ���
//     *
//    ***
//   *****
//  *******
// *********
//***********

import java.util.Scanner;

public class PrintTriangle3 {

	public static void main(String[] args) {
		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
