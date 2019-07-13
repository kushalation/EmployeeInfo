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

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getDesignation());
        System.out.println(employee.getDepartment().getId());
        System.out.println(employee.getDepartment().getName());    }

}