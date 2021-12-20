package lesson13;

public class Employee {
    private String fullName;
    private int workAge;
    private int serviceNumber;
    private static int counter = 0;

    public Employee(String fullName) {
        this.fullName = fullName;
        counter++;
        serviceNumber = counter;
        workAge = 0;
    }

    public Employee(String fullName, int workAge) {
        this.fullName = fullName;
        this.workAge = workAge;
        counter++;
        serviceNumber = counter;
        workAge = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(final int workAge) {
        this.workAge = workAge;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(final int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "fullName='" + fullName + '\'' +
               ", workAge=" + workAge +
               ", serviceNumber=" + serviceNumber +
               '}';
    }
}
