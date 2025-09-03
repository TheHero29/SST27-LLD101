package exercise;

public class EmployeeLDAPAdapter implements Employee {
    EmployeeLDAP emp;

    EmployeeLDAPAdapter(EmployeeLDAP e) {
        this.emp = e;
    }

    public String getId() {
        return emp.get("uid");
    }

    public String getFirstName() {
        return emp.get("givenName");
    }

    public String getLastName() {
        return emp.get("sn");
    }

    public String getEmail() {
        return emp.get("mail");
    }
}
