public class PhD extends Employee implements StudentInterface{
    // do I have to name all attributes that are inherited
    // float salary;
    String subject;
    // ok, I kind of think that a PhD should be treated as a student, too....
    PhD(String _name, float _salary, String _subject) {
        super(_name, _salary);
        this.subject = _subject;
    }

    public String getSubject(){
        return subject;
    }

    PhD(String _name, String _subject) {
        super(_name, 0);
        this.subject = _subject;
    }



    @Override
    public String getDescriptor() {
        return "PhD student " + getName();
    }

    @Override
    public String toString() {
        return super.toString() + "; subject: " + subject; // lets see if I can cast this way
    }
}
