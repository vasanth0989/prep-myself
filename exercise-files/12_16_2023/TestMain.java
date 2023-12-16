public class TestMain {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vasanth", "Discover", 100.00d);
        Employee emp2 = new Employee("Prudhvi", "Discover", 200.00d);
        Employee emp3 = new Employee("Teja", "Nordstorm", 300.00d);

        // if else
        // if employee name is equals Vasanth


//        if(emp1.getName().equalsIgnoreCase("vasanth")){}
        // Best practice always compare the known values first
        boolean val = false;
        if("vasanthh".equalsIgnoreCase(emp1.getName()) || emp1.getSalary() > 50.00d){
            val = true;
        }else{
            val = false;
        }
        System.out.println("Val:"+val);

        // Let's do this with ternary operator
        boolean value = ("vasanth".equalsIgnoreCase(emp1.getName()) && emp1.getSalary() > 50.00d)  ? true : false;
//        System.out.println("Value:"+value);

        // if employee name starts with 'v'







    }
}

class Employee {
    private double salary;
    private String name;
    private String company;

    public Employee (){}

    //argument constructor
    public Employee(String name, String company, double salary){
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
