class MyTime
{
	private int hour;
	private int minute;
	private int second;

	MyTime()
	{
		hour = 0;
		minute = 0;
		second = 0;
	}

	MyTime (int h,int m,int s)
	{
		hour=h;
		minute=m;
		second=s;
	}

	void setTime(boolean vh,boolean vm,boolean vs,int h,int m,int s) throws IllegalArgumentException
	{
		if (vh && vm && vs)
		{
			hour=h;
			minute=m;
			second=s;
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

	void setHour(boolean vh, int h)
	{
		if (vh)
			hour = h;
		else
			throw new IllegalArgumentException("INVALID HOUR");
	}

	void setMinute(boolean vm,int m)
	{
		if (vm)
			minute = m;
		else
			throw new IllegalArgumentException("INVALID MINUTE");
	}
	
	void setSecond(boolean vs, int s)
	{
		if (vs)
			second = s;
		else
			throw new IllegalArgumentException("INVALID SECOND");
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

	MyTime nextSecond()
	{
		MyTime temp = new MyTime(this.hour,this.minute,this.second);
		if (hour==23)
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
		}
		return temp;
	}

	MyTime nextMinute()
	{
		MyTime temp = new MyTime(this.hour,this.minute,this.second);
		if (hour==23)
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
		}
		return temp;
	}

	MyTime nextHour()
	{
		MyTime temp = new MyTime(this.hour,this.minute,this.second);
		if (hour==23)
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
		}
		return temp;
	}

	MyTime previousSecond()
	{
		MyTime temp = new MyTime(this.hour,this.minute,this.second);
		if (hour==0)
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
		}
		return temp;
	}

	MyTime previousMinute()
	{
		MyTime temp = new MyTime(this.hour,this.minute,this.second);
		if (hour==0)
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
		}
		return temp;
	}

	MyTime previousHour()
	{
		MyTime temp = new MyTime(this.hour,this.minute,this.second);
		if (hour==0)
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
		}
		return temp;
	}
	
}