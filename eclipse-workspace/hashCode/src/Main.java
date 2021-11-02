import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"shalu",21,6000,"IT");
        Employee e2 = new Employee(102, "kumar",24,19000,"CSE");

        Set<Employee> getDetails = new HashSet<>();
        System.out.println("FIRST EMPLOYEE DETAILS");
        getDetails.add(e1);
        System.out.println(e1);
        System.out.println("SECOND EMPLOYEE DETAILS");
        getDetails.add(e2);
        System.out.println(e2);
    }
}