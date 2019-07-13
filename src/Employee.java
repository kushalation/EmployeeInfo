public class Employee {

    private String id;

    private String name;

    private String designation;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "Employee { \n" +
                "id='" + id + "'\n" +
                "name='" + name + "'\n" +
                "designation='" + designation + "'\n" +
                "}";
    }
}