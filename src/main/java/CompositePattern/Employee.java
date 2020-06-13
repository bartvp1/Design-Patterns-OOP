package CompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
    private final String name;
    private final String dept;
    private final List<Employee> subordinates;


    public Employee(String name,String dept) {
        this.name = name;
        this.dept = dept;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee[] employees) {
        subordinates.addAll(Arrays.asList(employees));
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + " ]");
    }
}