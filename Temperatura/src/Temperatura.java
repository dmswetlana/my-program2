//������ ����������� �� ������� � ����������� �� ����������
import java.util.Scanner;
import static java.lang.System.out;


public class Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		out.print("������� ����������� (�): "); // ������ �������� ����� ������� (100,5)
		double tc = sc.nextDouble();            //������ � ���� ������
		double tf = tc*9/5+32;
		
		out.printf("����������� (F): %.2f\n", tf);
		sc.close();
		
	}

}
