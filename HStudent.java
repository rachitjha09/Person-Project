
/**
 * HS Student
 * @author (Rachit J)
 * @version (3/15/24)
 */
public class HStudent extends Student
{
    private double GPA;
    public HStudent(String name, String address, int grade, double GPA){
        super(name, address, grade);
        this.GPA=GPA;
        
    }
    @Override public String toString(){
        return super.toString() + " GPA: " + this.GPA;
    }
    public void setGPA(double g){
        GPA=g;
    }
    public double getGPA(){
        return GPA;
    }
}