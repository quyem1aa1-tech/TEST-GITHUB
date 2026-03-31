package LAB_OOP;

abstract class Member{
    private  String name;
    private String email;
    private String id;
    public Member(){

    }
    public Member(String name, String email, String id ){
        this.name=name;
        this.email=email;
        this.id=id;
    }
    public  String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setId(String id){
        this.id=id;
    }
    public abstract String getRole();
    @Override
    public String toString(){
        return " "+name+" "+email+" "+id;
    }


}
class Student extends  Member{
    private String Program;
    private int year;
    public Student(String name, String email, String id, String Program, int year){
        super(name,email,id);
        this.Program=Program;
        this.year=year;
    }
    public  String getProgram(){
        return Program;
    }
    public int getYear(){
        return year;
    }
    public void setPrograme(String Program){
        this.Program=Program;
    }
    public void setYear(int year){
        this.year=year;
    }
    @Override
    public String getRole(){
        return "student";
    }
    @Override
    public String toString(){
        return Program+" "+year+" "+super.toString();
    }
}
class Staff extends Member{
    private String department;
    private double baseSalary;
    public Staff(String name, String email, String id, String department, double baseSalary){
        super(name,email,id);
        this.department=department;
        this.baseSalary=baseSalary;
    }
    public  String getDepartment(){
        return department;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    @Override
    public String getRole(){
        return "staff";
    }
    @Override
    public String toString(){
        return department+" "+baseSalary+" "+super.toString();
    }
}
public class TestProblem1 {
    public static void main(String[] args){
        

       

        
    }
}
