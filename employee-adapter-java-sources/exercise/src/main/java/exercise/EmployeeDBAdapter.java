package exercise;

public class EmployeeDBAdapter implements Employee {
    EmployeeDB emp;

    EmployeeDBAdapter(EmployeeDB e) {
        this.emp = e;
    }

    public String getId() {
        return String.valueOf(emp.getId());
    }

    public String getFirstName() {
        return emp.getFirstName();
    }

    public String getLastName() {
        return emp.getSurname();
    }

    public String getEmail() {
        return emp.getEmailAddress();
    }
}
