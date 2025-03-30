package OOPsConcepts;

public class IntroAbstraction {
    public static void main(String[] args) {

        Employee emp = new Employee(101, 120000, "Ankit");
        System.out.println(emp.getEmp_id() + " " + emp.getName() + " " + emp.getSalary());

        Employee emp1 = new Employee();
        emp1.setEmp_id(101);
        System.out.println(emp1.getEmp_id());




    }
}

class Nokia implements phone {

    @Override
    public void incomingCall() {

    }

    @Override
    public void outgoingCall() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void recieveMessage() {

    }


}


interface phone {
    void incomingCall();

    void outgoingCall();

    void turnOff();

    void turnOn();

    void sendMessage();

    void recieveMessage();
}

class Employee {

    private int emp_id;
    private int salary;
    private String name;

    //This is constructor of Employee Class
    public Employee(){
        System.out.println("this is default constructor");
    }

    public Employee(int emp_id, int salary, String name){
        System.out.println("This is parameterized constructor");
        this.emp_id = emp_id;
        this.salary = salary;
        this.name = name;
    }

    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;

    }

    public int getEmp_id(){
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


}
