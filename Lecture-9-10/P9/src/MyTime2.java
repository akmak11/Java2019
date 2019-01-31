class MyTime2
{
	private int hour;
	private int minute;
	private int second;

	MyTime2()
	{
		hour = 0;
		minute = 0;
		second = 0;
	}

	MyTime2 (int h,int m,int s)
	{
		hour=h;
		minute=m;
		second=s;
	}

	void setTime(int h,int m,int s) throws IllegalArgumentException
	{
		if ( (h<24 && h>-1) && (m<60 && m>-1) && (s>-1 && s<60) )
		{
			this.hour=h;
			this.minute=m;
			this.second=s;
		}
		else
			throw new IllegalArgumentException("INVALID TIME!");
	}

	int getHour()
	{
		return hour;
	}

	int getMinute()
	{
		return minute;
	}

	int getSecond()
	{
		return second;
	}

	void setHour(int h)
	{
		if (h>23)
			this.hour = 0;
		if (h<0)
			this.hour = 23;
		else
			this.hour = h;
	}

	void setMinute(int m)
	{
		if (m>59)
			this.minute = 0;
		if (m<0)
			this.minute = 59;
		else
			this.minute = m;
	}
	
	void setSecond(int s)
	{
		if (s>59)
			this.second = 0;
		if (s<0)
			this.second = 59;
		else
			this.second = s;
	}

	public String toString()
	{
		String hh=Integer.toString(hour);
		String mm=Integer.toString(minute);
		String ss=Integer.toString(second);
		if (hour<10)
			hh = "0"+hour;
		if(minute<10)
			mm = "0"+minute;
		if (second<10)
			ss = "0"+second;
		return (hh+":"+mm+":"+ss);
	}

	MyTime2 nextSecond()
	{
		MyTime2 temp = new MyTime2(this.hour,this.minute,this.second);
		/*if (hour==23)
		{
			if (minute==59)
			{
				if (second==59)
				{
					temp.hour=0;
					temp.minute=0;
					temp.second=0;			
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second+=1;
				}
			}
			else
			{
				if (second==59)
				{
					temp.hour=hour;
					temp.minute+=1;
					temp.second=0;
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second+=1;
				}
			}
		}
		else
		{
			if (minute==59)
			{
				if (second==59)
				{
					temp.hour+=1;
					temp.minute=0;
					temp.second=0;			
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second+=1;
				}
			}
			else
			{
				if (second==59)
				{
					temp.hour=hour;
					temp.minute+=1;
					temp.second=0;
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second+=1;
				}
			}
		}*/
		return temp;
	}

	MyTime2 nextMinute()
	{
		MyTime2 temp = new MyTime2(this.hour,this.minute,this.second);
		/*if (hour==23)
		{
			if (minute==59)
			{
				temp.second=second;
				temp.minute=0;
				temp.hour=0;
			}
			else
			{
				temp.second=second;
				temp.minute+=1;
				temp.hour=hour;
			}
		}
		else
		{
			if (minute==59)
			{
				temp.second=second;
				temp.minute=0;
				temp.hour+=1;
			}
			else
			{
				temp.second=second;
				temp.minute+=1;
				temp.hour=hour;
			}
		}*/
		return temp;
	}

	MyTime2 nextHour()
	{
		MyTime2 temp = new MyTime2(this.hour,this.minute,this.second);
		/*if (hour==23)
		{
			temp.hour=0;
			temp.minute=minute;
			temp.second=second;
		}
		else
		{
			temp.hour+=1;
			temp.minute=minute;
			temp.second=second;
		}*/
		return temp;
	}

	MyTime2 previousSecond()
	{
		MyTime2 temp = new MyTime2(this.hour,this.minute,this.second);
		/*if (hour==0)
		{
			if (minute==0)
			{
				if (second==0)
				{
					temp.hour=23;
					temp.minute=59;
					temp.second=59;			
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second-=1;
				}
			}
			else
			{
				if (second==0)
				{
					temp.hour=hour;
					temp.minute-=1;
					temp.second=59;
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second-=1;
				}
			}
		}
		else
		{
			if (minute==0)
			{
				if (second==0)
				{
					temp.hour-=1;
					temp.minute=59;
					temp.second=59;			
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second-=1;
				}
			}
			else
			{
				if (second==0)
				{
					temp.hour=hour;
					temp.minute-=1;
					temp.second=59;
				}
				else
				{
					temp.hour=hour;
					temp.minute=minute;
					temp.second-=1;
				}
			}
		}*/
		return temp;
	}

	MyTime2 previousMinute()
	{
		MyTime2 temp = new MyTime2(this.hour,this.minute,this.second);
		/*if (hour==0)
		{
			if (minute==0)
			{
				temp.second=second;
				temp.minute=59;
				temp.hour=23;
			}
			else
			{
				temp.second=second;
				temp.minute-=1;
				temp.hour=hour;
			}
		}
		else
		{
			if (minute==0)
			{
				temp.second=second;
				temp.minute=59;
				temp.hour-=1;
			}
			else
			{
				temp.second=second;
				temp.minute-=1;
				temp.hour=hour;
			}
		}*/
		return temp;
	}

	MyTime2 previousHour()
	{
		MyTime2 temp = new MyTime2(this.hour,this.minute,this.second);
		/*if (hour==0)
		{
			temp.hour=23;
			temp.minute=minute;
			temp.second=second;
		}
		else
		{
			temp.hour-=1;
			temp.minute=minute;
			temp.second=second;
		}*/
		return temp;
	}
	
}