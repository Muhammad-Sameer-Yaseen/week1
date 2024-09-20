public class Demo{
	public static void main(String[] args){

	Rectangle r1 =new Rectangle();
	
	double length = 10;
	r1.setlength(length);

	double width = 10;
	r1.setwidth(width);

	double area = r1.area();
	System.out.println(area);	
	}
}