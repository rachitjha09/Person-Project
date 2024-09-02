
/**
 * Person Class
 *
 * @author (Rachit Jha)
 * @version (3/15/24)
 */
public class Person
{
    private String name;
    private String address;
    
    public Person(String name, String address){
        super();
        this.name=name;
        this.address=address;
    }
    @Override public String toString(){
        return "Name: "  + this.name + " Address: " + this.address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        return address;
    }
}