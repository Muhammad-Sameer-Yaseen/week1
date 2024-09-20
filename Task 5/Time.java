class Time{
	
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hrs, int min, int sec){
		hours=hrs;
		minutes=min;
		seconds=sec;
	}

	public void setHours(int hrs){
		if (hrs> 0 && hrs>=23)
			hours=hrs;
	}
	
	public void setMinutes(int min){
		if (> 0 && min>=60)
			minutes=min;
	}
	public void setSeconds(int sec){
		if (sec> 0 && sec>=60)
			seconds= sec;
	}

		//Getters

	public int getHours(){
		return hours;
	}

	public int getMinutes(){
		return minutes;
	}

	public int getSeconds(){
		return seconds;
	}

	public void display(){
		System.out.println(+hours +":"+minutes+":"+seconds);
	}
}