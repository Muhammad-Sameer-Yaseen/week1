class Date{

	int day;
	int month;
	int year;
	Time time;

	Date(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
	}
	
	Date(int d, int m, int y, Time t) {
        day = d;
        month = m;
        year = y;
        time = t;
	
	}

	public void setDay(int d){
			day=d;
	}

	public void setMonth(int m){
			month=m;
	}

	public void setYear(int y){
			year=y;
	}

	public int getDays(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public void display(){
		System.out.print(day+"-"+month+"-"+year);

	if (time != null) {
            		System.out.print(" ");
            time.display();
        	} else {
            		System.out.println();
        	}

	}

}