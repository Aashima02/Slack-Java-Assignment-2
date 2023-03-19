public class Details
{
    public static void main(String[] args)
    {
        System.out.println("Employee Details: ");
        Employee emp = new Employee();
        emp.Name("Kaz");
        emp.Age(21);
        emp.PhoneNumber("9873321560");
        emp.Address("Pune");
        emp.printSalary(27000);
        emp.specialization("Software Designer");
        System.out.print("\n");
        System.out.println("Manager Details: ");
        Manager man = new Manager();
        man.Name("Inej");
        man.Age(23);
        man.PhoneNumber("7852291046");
        man.Address("Mumbai");
        man.printSalary(50000);
        man.Department("AI Developer");

    }
}
