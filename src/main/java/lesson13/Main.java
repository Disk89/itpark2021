package lesson13;

import java.util.List;

/*
Необходимо создать класс, описывающую сущность работника (Employee), важными характеристиками которого являются ФИО,
табельный номер и общий стаж работы в организации. Необходимо реализовать метод печати в консоль имена тех рабочих,
которые имеют указанный стаж работы EmployeeUtils#printEmployee(Collection<Employee> employees, int workAge),
где employees - коллекция сотрудников, а workAge - стаж работы в организации
• Для обхода коллекции используйте итератор.
• Естественным является заполнение коллекции десятком/сотней объектов класса Employee, которые создаются удобным для
Вас способом, запрашивая из консоли или инициализирую в логике программы. В качестве передаваемой на вход коллекции
предполагается передача списка, множества или очереди.
• Дополнительно необходимо реализовать метод удаления элементов коллекции, стоящих на нечетных позициях, обходя список
с конца
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = DataGenerator.generateEmployees();
        EmployeeUtils.printEmployee(employees,2);
        EmployeeUtils.deleteOddEmployees(employees);
        System.out.println(employees);
        System.out.println(employees.size());
    }
}
