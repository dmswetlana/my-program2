// ������ � java ������������ ����� ������

import static java.lang.System.out;
//������� ������ ����������� ������� �����,
//��������: import java.util.Date; (����������� ����� Date)
// ����������� ������ ����������� ���� ��� ����� ������
//������� ����������� ������ ���� � ������������ ���� out
// import static java.lang.System.out;

import java.util.Scanner;
//���������� ����� Scanner ��� ����� � �������.
//�� ��������� �������� � ����� ������� � ������ ���������
//������, �������� ������.

public class Strings {

	public static void main(String[] args){ 
	{	
		String s1 = "������"; //� s1 ���������� ����� ������
		String s2 = new String("������");
		
		//������� ������ ������ �������� �������������
	
		char ch = s1.charAt(0); //���� ����� ��������� �������� ������ ������
		                       //�� ��� ����������� ������
		out.println(s1);
		out.println(ch);
		
		String hello = "������";
		String name = "������";
		String result = hello + " " + name.toUpperCase(); 
		//����� toUpperCase() ��������� ������ � ������� ������� 
		
		out.println(result);
	}
/*	{
		//��������� ������ �� 100 ����� ����� ������
		//��� ������� BAD, ��� ������ �� �����
		//�������� � ������ 302 ������� ������ String
		// �������� ��������
		String r = ""; //������� ������ ������
		for (int i=1; i<=100; i++)
		r = r + String.valueOf(i) + " "; //����� i ��������� � ������
		out.println(r);
		
		
		StringBuilder sb = new StringBuilder(); //���� ����� StringBuilder �� ������ 
		                                        //� ������ ����� �������, � ��������
		                                        //������������
		for (int i=1; i<=100; i++)
			sb.append(i).append(" "); //����� append ���������� ������ �� ���� �� ������
			
		//��������� �������� �� String a StringBuilger, �������
		//������� toString ������ ��������������� � String
			String r = sb.toString();
			out.println(sb);
	*/	{	
		//���������� ���� � �������
			Scanner sc = new Scanner(System.in);
			out.print("������� ������: ");
			String s = sc.nextLine(); //����� nextLine ���������� ������,
			                          //�������� � �������
			out.println(s);
			
		//���������� ��������� �����
			String s3="Sergey";
			boolean rs = (s == s3); //������������ ������, � �� ��������
			out.println(rs);
	
				
		//� java ������ ������������� ������� equals
			
			boolean rs1 = (s.equals(s3)); //������������ ���������� �����
			out.println(rs1);		
			}
		{
		String s1 = "������"; //� ������ ����� ���� ������. ���������� ��������������.
		String s2 = "������"; //����� ��� ������� �������� ���������� ������
		
		boolean r = (s1 == s2);
		out.println(r);
		
		String s3 = new String ("������"); //����� ��������� ��� �������
		String s4 = "������";              //new ������ ������ ����� ������
		                                   //������ �������� ������
		r = (s3 == s4);
		out.println(r);
		
		String s5 = "������";           //������ ����� �����
		String s6 = "���" + "���";      //������ ����� ����, ��� � ������ ������
		r = (s5 == s6);
		out.println(r);
		
		String s7 = "������";        //������ �� ����� �����
		String s8 = "���";           //���������� ����������� ��������� �� �����.
		String s9 = "���" + s8;      //� ��������� ���� �� ������ ��������, �� � ����������
		r = (s7 == s9);
		out.println(r);
		
		}
	
	
	
	}
}
