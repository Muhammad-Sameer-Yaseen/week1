public class Main{
	public static void main(String[] args){

	Date d1= new Date();

	int date= 6;
	d1.setdate(date);

	int month= 9;
	d1.setmonth(month);

	int year= 2024;
	d1.setyear(year);

	System.out.println("Date : "+d1.getdate()+"-"+d1.getmonth()+"-"+d1.getyear());
	}
	
}