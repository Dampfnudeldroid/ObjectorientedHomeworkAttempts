public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world! :)");

        Professor seidl = new Professor("Seidl", 11111111);
        Employee olli = new Employee("Hagedorn", 8888);
        Tutor anja = new Tutor("Anja", "M. Sc. Neurobiology","Comp. Neurobiology 1" ,512);
        PhD rando = new PhD("John Smith","Data Science");
        UniMember achmed = new UniMember("Altuntas");
        Student marc = new Student("Marc Zuckerberg","Informatik");

        System.out.println("List of all objects:");
        System.out.println(seidl.toString());
        System.out.println(olli.toString());
        System.out.println(anja.toString());
        System.out.println(rando.toString());
        System.out.println(achmed.toString());
        System.out.println(marc.toString());

        System.out.println("Let's hire some people");
        seidl.hire(olli);
        //seidl.hire(anja); // this doesn't work as Anja implements the employeeinterface but isnt an EMployee...
        seidl.hire(anja, 444);
        // seidl.hire(rando);
        seidl.hire(rando, 22222);
        seidl.hire(achmed, 3333);

        System.out.print(seidl.listStaff());

        System.out.println(anja.getDescriptor());
        System.out.println(anja.toString());

        // this does not work as hoped, let's see what the next lectures have to offer


    }




}
