import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Employee employee = new Employee();
        admin.add();
        while (true){
            System.out.println("1.Admin");
            System.out.println("2.Employee");
            System.out.println("3.Developer Information");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: admin.adminLogin();
                    break;
                case 2: employee.employeeLongin();
                    break;
                case 3:
                    System.out.println("Kowshik Kumer Mozumder");
                    System.out.println("Daffodile International University");
                    break;
                case 4: return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}