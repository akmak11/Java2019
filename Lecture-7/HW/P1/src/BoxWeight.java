class BoxWeight extends Box
{
	float weight;

	BoxWeight()
	{
		super();
		weight=0;
	}

	BoxWeight(float w,float h, float d,float we)
	{
		super(w,h,d);
		weight=w;
	}

	void setWeight(float we)
	{
		weight = we;
	}

	float getWeight()
	{
		return weight;
	}

	void display()
	{
		System.out.println(weight);
	}
}