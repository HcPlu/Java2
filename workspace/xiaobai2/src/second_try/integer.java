package second_try;

import java.util.Scanner;

public class integer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������1~10^1000����");
		     System.out.println("inter1");
		String inter1 = input.nextLine();// �ַ���inter1
		System.out.println("inter2");
		String inter2 = input.nextLine();
		String[] arrays12 = inter1.split("");// �����ַ�������arrays12
		int num1 = 0, num2 = 0, a, c = 0;
		int[] ch1 = new int[inter1.length()];// ������������ch1
		for (int i = 0; i < inter1.length(); i++) {
			System.out.println();
			ch1[i] = Integer.parseInt(arrays12[i]);
		} // ��arrays12ת��Ϊ��������ch1
		int[] ch2 = new int[inter2.length()];
		String[] arrays22 = inter2.split("");
		for (int i = 0; i < inter2.length(); i++) {
			ch2[i] = Integer.parseInt(arrays22[i]);
		} // ��inter2ת��Ϊ��������ch2
		int num11 = ch1.length;
		int num22 = ch2.length;
		// �ֱ����ch1��ch2�ĳ���
		int Max = Math.max(num11, num22);
		int[] inter3 = new int[Max];
		for (int i3 = 0; i3 < Max - 1; i3++) {
			if (c == 0) {
				a = ch1[num11] + ch2[num22];
				num11--;
				num22--;
			} else {
				a = ch1[num11] + ch2[num22] + 1;
			}
			if (a < 10) {
				inter3[Max] = a;
				Max--;
				c = 0;

			} else {
				inter3[Max] = a / 10;
				Max--;
				c = 1;
			} // ������λ����
			System.out.print(ch1[0] + ch2[0]);
			for (int k = 0; k < inter3.length; k++) {
				System.out.print(inter3[k]);
			}
		}

	}

}
