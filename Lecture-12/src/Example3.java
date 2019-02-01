import java.util.*;
class Example3
{
	public static void main(String[] args)
	{
		Student s1 = new Student (101,"Ak",32);
		Student s2 = new Student (102,"Aks",31);
		Student s3 = new Student (103,"Aksh",30);
		ArrayList <Student> al = new ArrayList <Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}