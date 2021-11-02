 class Employee
{


    private int id;
    private String name;
    private int age;
    private double salary;
    private  String dept;



    public Employee(int id,String name, int age,double salary,String dept)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employee employee = (Employee) o;

        if (id != employee.id) {
            return false;
        }
        if (!name.equals(employee.name)) {
            return false;
        }
        if (age != employee.age) {
            return false;
        }
        if (salary != employee.salary) {
            return false;
        }
        if (dept != employee.dept) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
         int result1 = dept.hashCode()+result;
        result1 = 31 * result1 + id+age;
        return result1;
    }

    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", age= " + age + " id= "+id+" salary= "+salary+" dept= "+dept+
                '}';
    }
}
