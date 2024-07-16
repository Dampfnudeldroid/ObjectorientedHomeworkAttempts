import java.util.ArrayList; // import the ArrayList class

public class Professor extends Employee{
    //Employee[] staff;
    // int array[] = new int[4] so initialisiert man ein Array
    // TODO in the future: https://www.digitalocean.com/community/tutorials/java-list
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

    public void hire(UniMember m, float salary){
        // is this valid? I am not too sure
        Employee newEmployee = new Employee(m.getName(),salary);
        staff.add(newEmployee);
    }

    public String listStaff(){
        String text = "";
        // loop over members
        for (Employee emp: staff){
            text = text + emp.getDescriptor() + "\n";
        }

        return  text;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Staff: " + listStaff();
    }
}
