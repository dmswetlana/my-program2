
public class Program {

	public static void main(String[] args) {
		
		Point p1 = new Point(100, 200, "red");
		
		//p1.move(50, 70);
		//p1.color = "red";
		p1.draw();
		
		Point p2 = p1.clone();
		
		Circle c1 = new Circle(10,20,40, "Blue");
		c1.draw();
		
		System.out.println(p1.hashCode());
		System.out.println(p1);
		System.out.println(p1.toString());
		
	}

}
