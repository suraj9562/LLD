public class Main {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();
        Employee employee = facade.getEmployeeDetails(0);
    }
}