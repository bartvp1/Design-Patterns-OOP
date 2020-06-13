package CompositePattern;

public class CompositePattern {

    public static void main(String[] args){
        Employee CEO = new Employee("John","CEO");

        Employee headSales = new Employee("Robert","Head Sales");

        Employee headMarketing = new Employee("Michel","Head Marketing");

        Employee clerk1 = new Employee("Laura","Marketing");
        Employee clerk2 = new Employee("Bob","Marketing");

        Employee salesExecutive1 = new Employee("Richard","Sales");
        Employee salesExecutive2 = new Employee("Rob","Sales");

        CEO.add(new Employee[]{headSales, headMarketing});
        headSales.add(new Employee[]{salesExecutive1, salesExecutive2});
        headMarketing.add(new Employee[]{clerk1, clerk2});

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }

        }
    }
}
