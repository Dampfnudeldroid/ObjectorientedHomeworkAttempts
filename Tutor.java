public class Tutor extends Student implements EmployeeInterface{
    // was braucht ein Tutor, was ein PhD nicht hat?
    float salary;
    String course;
    // Constructor
    Tutor(String _name, String _ownsubject, String teachingCourse, float _salary) {
        super(_name, _ownsubject);
        this.salary = _salary;
        this.course = teachingCourse;
    }

    @Override
    public String getDescriptor() {
        return getName() + ", student tutor for " + course ;
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "; salary: " + Float.toString(salary)+ "; course:" + course;
    }
}
