package composite;

import java.util.ArrayList;
import java.util.List;

/* Clase Compuesta */
public class GroupEmployee implements Employee {
    /* Atributos */
    private String groupName;
    private List<Employee> employees;

    /* Constructor */
    public GroupEmployee ( String groupName ) {
        this.groupName = groupName;
        this.employees = new ArrayList<>();
    }

    /* Métodos */
    public void addEmployee( Employee employee ) {
        this.employees.add( employee );
    }

    public void removeEmployee( Employee employee ) {
        this.employees.remove(employee);
    }

    @Override
    public String doJob() {
        String result = new String( "-- " + this.groupName + "\n");

        for ( Employee employee: this.employees ) {
            result += employee.doJob();
        }

        return result;
    }
}
