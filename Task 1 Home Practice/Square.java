public class Square{

	private double length;
	private double area;


	public void setlength( double length1){
		if(length1>0){
			length= length1;
	}
}

	public double area(){
		return length*length;
}

}