package composite;

public class Main {
    public static void main(String[] args) {
        /* Root */
        GroupEmployee company     = new GroupEmployee("Company");
        /* Composite Nodes */
        GroupEmployee development = new GroupEmployee("Development");
        GroupEmployee marketing   = new GroupEmployee("Marketing");
        /* Leap Nodes */
        Employee emp1 = new SingleEmployee("John");     // Development
        Employee emp2 = new SingleEmployee("Mark");     // Development
        Employee emp3 = new SingleEmployee("Kevin");    // Development
        Employee emp4 = new SingleEmployee("Martha");   // Marketing
        Employee emp5 = new SingleEmployee("Sue");   // Marketing

        development.addEmployee(emp1);
        development.addEmployee(emp2);
        development.addEmployee(emp3);

        marketing.addEmployee(emp4);
        marketing.addEmployee(emp5);

        company.addEmployee( development );
        company.addEmployee( marketing );

        System.out.println( company.doJob() );

    }
}
