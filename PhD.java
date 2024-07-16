public class PhD extends Student implements EmployeeInterface{
    // do I have to name all attributes that are inherited
    float salary;
    // ok, I kind of think that a PhD should be treated as a student, too....
    PhD(String _name, float _salary, String _subject) {
        super(_name, _subject);
        this.salary = _salary;
    }

    PhD(String _name, String _subject) {
        super(_name, _subject);
        this.salary = 0;
    }

    @java.lang.Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String getDescriptor() {
        return "PhD student" + getName();
    }

    @Override
    public String toString() {
        return super.toString() + "; salary: " + Float.toString(salary); // lets see if I can cast this way
    }
}
