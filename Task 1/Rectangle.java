public class Rectangle{
	private double length;
	private double width;

	public void setlength(double length1){
		if(length1 >0)
			length=length1;
	
	}

	public void setwidth(double width1){
		if(width1 >0)
			width=width1;		
	}

	public double area(){
		return length*width;
	}
}