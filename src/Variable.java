public class Variable {
    public int roll;
    public java.lang.String name;
    public boolean passed;
    public Variable(){
        roll = 100;
        name= "CSE";
        passed = false;
    }
    public Variable(int roll,String name,Boolean passed){
        this.roll = roll;
        this.name = name;
        this.passed = passed;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassed(boolean passed){
        this.passed = passed;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public boolean isPassed(){
        return passed;
    }
    public static void main(String[] args){
        Variable variable = new Variable();
        variable.name = "Name = Zinia";
        variable.roll = 31;
        variable.passed = true;

        System.out.println(variable.getName());
        System.out.println(variable.getRoll());
        System.out.println(variable.isPassed());
    }
}
