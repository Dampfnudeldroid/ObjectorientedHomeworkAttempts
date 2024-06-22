public class UniMember implements UniMemberInterface {
    // Attributes
    String name;

    // constructor
    UniMember(String _name){
        name = _name;
    }
    @Override
    public String getName() {
        return name;
    }
}
