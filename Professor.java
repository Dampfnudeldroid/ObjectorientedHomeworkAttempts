import java.util.ArrayList; // import the ArrayList class

public class Professor extends Employee{
    //Employee[] staff;
    // int array[] = new int[4] so initialisiert man ein Array
    ArrayList<Employee> staff = new ArrayList<Employee>();
    // doch kein Array, da da die maximale Anzahl festgelegt werden muss
    Professor(String _name, float _salary){
        super(_name, _salary);
    }

    // function to hire staff
    public void hire(Employee m){
        staff.add(m);
    }

    public void fire(Employee m){
        staff.remove(m);
    }
}
