/**
 * class EmployedStudent is supposed to combine PhD and tutor because
 * both are students but also get salaries,
 * HOWEVER, now I realise that an unemployed tutor is just a Student,
 * whereas an unpayed PhD is still a PhD... maybe I am not actually going to use it....
 */
public class EmployedStudent extends Student implements EmployeeInterface {
    // do I have to name all attributes that are inherited
    String subject;
    float salary;
    String type; // for example PhD, tutor etc.
    // ok, I kind of think that a PhD should be treated as a student, too...
    EmployedStudent(String _name, float _salary, String _subject, String _type) {
        super(_name, _subject);
        this.salary = _salary;
        this.type = _type;
    }

    EmployedStudent(String _name, String _subject) {
        super(_name, _subject);
        this.salary = 0;
        this.type = "no";
    }

    @java.lang.Override
    public float getSalary() {
        return salary;
    }


}
