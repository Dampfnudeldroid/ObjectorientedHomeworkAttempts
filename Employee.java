public class Employee extends UniMember implements EmployeeInterface{
    float salary;

    // constructor
    Employee(String _name, float _salary){
        super(_name); // calls super constructor
        this.salary = _salary;
    }

    @Override
    public float getSalary() {
        return salary;
    }
}
