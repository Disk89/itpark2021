package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    public static void deleteOddEmployees(List<Employee> employees) {
        ListIterator<Employee> listIterator = employees.listIterator(employees.size());
        while (listIterator.hasPrevious()) {
            listIterator.previous();
            int index = listIterator.previousIndex();
            if (index % 2 != 0) {
                listIterator.remove();
            }
        }
    }
}