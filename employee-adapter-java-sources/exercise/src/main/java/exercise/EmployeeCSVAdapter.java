package exercise;

public class EmployeeCSVAdapter implements Employee {
  String[] tokens;
  EmployeeCSV emp;
  EmployeeCSVAdapter(EmployeeCSV e) {
    this.emp=e;
    this.tokens = e.tokens();
  }

  public String getId() {
    return tokens[0];
  }

  public String getFirstName() {
    return tokens[1];
  }

  public String getLastName() {
    return tokens[2];
  }

  public String getEmail() {
    return tokens[3];
  }
}
