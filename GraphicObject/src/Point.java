//������ ����� �� GraphObject

public class Point extends GraphObject  {

	public int x=0;
	public int y=0;
	public String color="green";
	
	public Point(int x, int y, String color){
		super(color);
		System.out.println("Point(x,y,color) ctor");
		this.x = x;
		this.y = y;
		//this.color = color;
	}
	
	public Point(int x, int y){
		this(x,y, DEFAULT_COLOR);
		System.out.println("Point(x,y) ctor");
	}
	
	public Point(){
		this(0,0, DEFAULT_COLOR);
		System.out.println("Point() ctor");
		
	}
	public void move (int dx, int dy){
		 this.x = this.x+dx; //x +=dx;
		 this.y = this.y+dy; //y +=dy;
		 System.out.printf("x+dx = %d; y+dy = %d \n", x, y);
	}
	
	//������������� ����� ������������� ������
	@Override
	public void draw(){
		System.out.println(this);
		super.draw();//������� ����� ������������� ������
		
	}
	
	@Override
	public String toString() {
		
		return String.format("Point (%d,%d) %s", x, y, super.color);
	}
	
}