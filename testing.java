class student
{
   int rollNumber;
   String name;
   void printDetails()
   {
   	System.out.println("roll number "+rollNumber);
   	System.out.println("name "+name);
   }
}
class testing
{
	public static void main(String[] args)
	{
		student[] boys = new student[10];
		for(int i=0;i<10;i++)
		{
			Integer n = i;
			boys[i] = new student();
			boys[i].rollNumber = i*10000;
			boys[i].name = "boy"+n.toString();
		}
		for(int i=0;i<10;i++)
		{
			boys[i].printDetails();
		}
	}
}