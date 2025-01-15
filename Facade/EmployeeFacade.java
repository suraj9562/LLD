public class EmployeeFacade {
    EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insert();
    }

    public Employee getEmployeeDetails(int employeeId) {
        return employeeDAO.getEmployeeDetails(employeeId);
    }
}
