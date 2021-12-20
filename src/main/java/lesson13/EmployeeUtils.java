package lesson13;

import java.util.Collection;
import java.util.Iterator;

public class EmployeeUtils {

    public static void printEmployee(Collection<Employee> employees, int workAge) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
           if(employee.getWorkAge() == workAge) {
               System.out.println(employee);
           }
        }

    }
}
