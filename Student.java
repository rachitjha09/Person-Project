
/**
 * Student
 * @author (Rachit)
 * @version (3/15/24)
 */
public class Student extends Person
{
    private int grade;
    public Student(String name, String address, int grade){
        super(name, address);
        this.grade=grade;
    }
    @Override public String toString(){
        return super.toString() + " Grade Level: " + this.grade;
    }
    public void setGrade(int g){
        grade=g;
    }
    public int getGrade(){
        return grade;
    }
}