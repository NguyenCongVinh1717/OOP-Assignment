
package Chuong3.Employee;
public class Employee extends Person {
    protected String employerName;
    protected String dateHired;

    public Employee() {
    }

    public Employee( String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getEmployeeName() {
        return employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return super.toString()+ " Employee{" + "employerName=" + employerName + ", dateHired=" + dateHired + '}';
    }
    
    
}
