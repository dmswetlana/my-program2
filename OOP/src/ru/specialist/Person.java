package ru.specialist;
//����� Person (���, �������) 
import java.util.*;

public class Person 
{
	public String name=" ";
	public int age = 0;
	
	//������ ��������� ��� ���������� � �� ����
	//����������� ���� �������� ������ Person
	static  List<Person> persons  = new  ArrayList<Person>();
	
	//�������  - ������� ������� ����� �������
	public static int counter=0; 
	
	//����������� �����������, ����������� ����� �����
	//������������� ����������� ����������
	//���������� ������ ������ ���� ���
	static{
		counter = 0;
	}
	

	
	//������ ����������� ��� ����� ������ � ����� �����������
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		counter++;
		persons.add(this);
	}

	//������ ����������� ��� ����� ������ ��� ����������
		public Person(){
			this.name = "����������";
			this.age = 10;
			counter++;
			persons.add(this);
		}
	
		//������ ����������� ��� ����� ������ � ����� ����������
				public Person(String name){
					//this.name = name;
			this(name,2);
		//���� �������� ������ ������ �����������, �� ��� �����
		//������� ������ ���� ��� � ������ �������
				}
			
	//����� show ������� � ������� ��� � ������� 
	public void show(){
		System.out.printf("%s - %d \n", this.name, this.age);
	}
	
	//����� showAll ���������� ��� ���������
	public static void showAll(){
		for(Person p : persons)
			p.show();
	}
	
	
	
}
