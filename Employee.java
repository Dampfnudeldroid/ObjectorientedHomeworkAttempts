public class Employee extends UniMember implements EmployeeInterface{
    float salary;
    // constructor
    Employee(String _name, float _salary){
        super(_name); // calls super constructor
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String getDescriptor() {
        return "Employee:" + getName();
    }

    @Override
    public String toString() {
        return super.toString() + "; salary: " + salary;
    }
}
