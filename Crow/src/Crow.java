import java.util.Scanner;
import static java.lang.System.out;

public class Crow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.print("������� ����� ����� �� ����� : " );
		int  n = sc.nextInt();
		//���� ����� ����� �� �������������, �� �����������
		//��������� ����� �����
		int n1 = n%10;
		
		//�� ���������, ���� ����� ������������ �� 11, 12, 13
		//���� ������� �� ���� ��������� ����
		int n2 = n%100;
		
		String v="";
		
		if (n2>=11 && n2<14)
			v = "�����";
		else
		{
		switch(n1)
		{
		case 1:
			v ="������";
			break;
		case 2:
		case 3:
		case 4:
			v = "������";
			break;
		case 0:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			v="�����";
			break; 
		}
		}
		String result = String.format("�� ����� %d %s", n,v);
		
		out.println(result);
	}

}
