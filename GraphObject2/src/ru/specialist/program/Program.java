package ru.specialist.program;

import ru.specialist.graph.*;
//import ru.specialist.ext;

public class Program {

	public static void main(String[] args) {
			
			Point p1 = new Point(100, 200, "red");
			
			GraphObject g1=p1; //переменная родительского класса
			
			g1=new Circle(10, 10, 20);
			
			Object o1 = new Point(10,10);
			
			System.out.println(o1 instanceof GraphObject );
			
			if (g1 instanceof Point){
				 Point p3 = (Point)g1;
				 p3.draw();
			 }
			
			
			//p1.move(50, 70);
			//p1.color = "red";
			p1.draw();
			g1.draw();
			p1.move(10,10);
			
			Point p2 = p1.clone();
			p2.setX(100);
			
			
			Circle c1 = new Circle(10,20,40, "Blue");
			c1.draw();
			c1.setRadius(20);
			
			
			
			System.out.println(p1.hashCode());
			System.out.println(p1);
			System.out.println(p1.toString());
			System.out.println(p2.getColor());
			GraphObject.scaleScene(2);
			GraphObject.drawScene();
	}


	}


