public class Student extends UniMember implements StudentInterface {
    String subject;
    Student(String _name, String _subject){
        super(_name); // calls super constructor
        this.subject=_subject;
    }

    @java.lang.Override
    String getSubject(){
        return this.subject;
    }

}
