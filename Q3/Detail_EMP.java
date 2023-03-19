public class Detail_EMP
{
    public static void main(String[] args)
    {
        System.out.println("Name \t Year of joining \t\t Address \t\t\t Salary");
        EmployeeDetails e1 = new EmployeeDetails();
        e1.emp_details("Robert",1994,"64C - WallsStreet",32000);
        EmployeeDetails e2 = new EmployeeDetails();
        e2.emp_details("Sam   ",2000,"68D - WallsStreet",18500);
        EmployeeDetails e3 = new EmployeeDetails();
        e3.emp_details("John",1999,"26B - WallsStreet",25000);
    }
}
