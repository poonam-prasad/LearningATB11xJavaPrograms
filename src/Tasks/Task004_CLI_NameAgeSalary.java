package Tasks;

public class Task004_CLI_NameAgeSalary {
    public static void main(String[] args) {

        System.out.println("Enter Name, Age , Salary");
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        double salary=Double.parseDouble(args[2]);

        System.out.println("Name is "+name+" Age is "+age+" Salary is "+salary);
    }
}
