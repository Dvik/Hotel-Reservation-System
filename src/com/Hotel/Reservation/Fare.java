package com.Hotel.Reservation;

public class Fare {

	public int farecalculator(int days,int rate,int s)
	{
			if(s==1)
			{
				return days*rate;
			}
			
			if(s==2)
			{
				return days*rate*2;
			}
	
	return 0;
}
}
