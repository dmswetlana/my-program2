package ru.specialist;

public class Program {

	//�������� ��� ������� sin
	
	//��������� - ���������� ����, �� �������
	//�� ����� ���� ��������
	public static final int STEPS=1000000;
	
	public static double integral(MathFunction f, double a, double b){
		double h = (b-a)/STEPS;
		double summa = 0D;
		for (int i=0; i<STEPS; i++)
		{
			double x = a+ h*i + h/2;
			double y = f.function(x);
			summa += y*h;
		}
		return summa;
	}
	
	
	public static void main(String[] args) {
		
	/*	{
			
			//�������� �������� ��������� ������ � 
			//��������� �� 0 �� ��/2
			Sinus s = new Sinus();
			double r1 = integral(s, 0, Math.PI/2);
			System.out.println(r1);
		}*/
		
		// ����� ��������� �����
		double r1 = integral(new MathFunction()
				{
			public double function(double x)
			{
				return Math.sin(x);
			}
				}
				, 0, Math.PI/2);
		System.out.println(r1);
		
		
		//��� cos
		double r2 = integral(new MathFunction()
		{
	public double function(double x)
	{
		return Math.cos(x);
	}
		}
		, 0, Math.PI/2);
System.out.println(r2);


		
		
		Outer o = new Outer(10);
		
		Outer.Nested n = new Outer.Nested();
		n.updateOuterData(o);
	System.out.println(o.getData());
	
		Outer.l.multiple();
		System.out.println(o.getData());
		Outer.l2.multiple();
		System.out.println(o.getData());
		
		Outer.Inner inner = o.new Inner();
		inner.updateOuterData();
	
		Invoice inv = new Invoice("���� & ������");
		System.out.println(inv);
		//������ ������ ���������
		//inv.new Line("Book",2,100);
		//Invoice.Line l1=inv.new Line("Book",2,100);
		//inv.new Line("Dvd",3,400);
		//l1.setQuantity(1);
		//System.out.println(inv);	
	
	}
}
