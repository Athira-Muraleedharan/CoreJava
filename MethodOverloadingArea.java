class Square{
	public double side;
}
class Triangle{
	public double height;
	public double base;
}
class Circle{
	public double radius;
}
class Shape{
	public double calculateArea(Circle c){
		System.out.println("Circle area is:");
		return c.radius*2*3.14;
	}
	public double calculateArea(Triangle t){
		System.out.println("Triangle area is:");
		return 0.5*t.base*t.height;
	}
	public double calculateArea(Square s){
		System.out.println("Square area is:");
		return s.side*s.side;
	}
}
public class MethodOverloadingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Square cc=new Square();
		Triangle dt=new Triangle();
		c.radius=78.90;
		cc.side=89;
		dt.base=132.2;
		dt.height=13;
		double area=0.0;
		Shape f=new Shape();
		area=f.calculateArea(cc);
		System.out.println(area);
		area=f.calculateArea(c);
		System.out.println(area);
		area=f.calculateArea(dt);
		System.out.println(area);

	}

}
