class Demo{

public static void main(String args[]){

	
	Date d1= new Date(14,9,2024);
	Time t1= new Time(10,30, 59);

	Date dWithTime = new Date(13, 9, 2024, t1);
        dWithTime.display();



	}
}