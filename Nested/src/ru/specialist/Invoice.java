package ru.specialist;

import java.util.List;
import java.util.ArrayList;

public class Invoice {

	private  String contragent;
	private double total;
	
	//��������� List �������������� �������� Line
	private List<Line> lines = new ArrayList<Line>();
	
	
	public String getContragent() {
		return contragent;
	}

	public double getTotal() {
		return total;
	}

	public Invoice(String contragent) {
		super();
		this.contragent = contragent;
	}

	public void setContragent(String contragent) {
		this.contragent = contragent;
	}

	@Override
	public String toString() {
	//���������� ������� � ��������� ������� ������ � �����
	//������� ��������� ������, ������� �������� 
	//��������������� ��������� 
	
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%-20s : %7.2f\n", getContragent(), getTotal()));
		sb.append("--------------------\n");
	//���������� ������ ���������
		for(Line line : lines)
		sb.append(line.toString()).append("\n");
		return sb.toString();
	//� StringBuilder ������������ ������������� ���������
	}
	
	
	//������ Inner �����
	public class Line {
		
		private String good; //�����
		private int quantity; //����������
		private double price; //����
		private double summa; //����� �� ������
	
		//����� ��� ������� ����� �� ���������� � ����
		private void updateSumma(boolean update)
		{
			//���� ����� ������, �� ������� ������ ���������� �����
			if(update)
				total -=summa;
			summa = quantity*price;
			total += summa; //����� ����� ���������
		}
		
		
			
		//����������� ��� ��� �����
		public Line(String good, int quantity, double price) {
			super();
			this.good = good;
			this.quantity = quantity;
			this.price = price;
			updateSumma(false);
			//����� ��������� � ��������� ������
			lines.add(this); //���� �� �������� �������		
		}

		public String getGood() {
			return good;
		}

		public void setGood(String good) {
			this.good = good;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
			updateSumma(true); //�������� �����, ���� �������� ���-��
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
			updateSumma(true); //�������� ����� ������� ����
		}

		public double getSumma() {
			return summa;
		}
	
		@Override
	public String toString() {
		
		return String.format("%20s: %4d %6.2f %7.2",
				getGood(), getQuantity(), getPrice(), getSumma());
	}
	
	
	}
	
}
