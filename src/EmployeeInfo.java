public class EmployeeInfo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId("01");
        employee.setDesignation("Developer");
        employee.setName("Tom");

        Department department = new Department();
        department.setId("01");
        department.setName("Engg");

        employee.setDepartment(department);

        System.out.println(employee.getName() + " is from "
                + employee.getDepartment().getName() + " department");
        System.out.println(employee.toString());
        System.out.println(department.toString());
    }

}