package lesson7;

public class Tiger {
    private String name;
    private int age;
    private String color;
    private static final int LIMIT_RUN = 1000;
    private static final int LIMIT_SWIM = 100;

    public Tiger(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void run(int distance) {
        if (distance > LIMIT_RUN || distance < 0) {
            System.out.println(name + " can't run it");
        } else if (distance == LIMIT_RUN) {
            System.out.println(name + " the tiger barely runs " + distance + " meters");
        } else {
            System.out.println(name + " the tiger easily runs " + distance + " meters");
        }
    }


    public void swim(int distance) {
        if (distance > LIMIT_SWIM || distance < 0) {
            System.out.println(name + " can't swim it");
        } else if (distance == LIMIT_SWIM) {
            System.out.println(name + " the tiger barely swims " + distance + " meters");
        } else {
            System.out.println(name + " the tiger easily swims " + distance + " meters");
        }
    }

    @Override
    public String toString() {
        return "Tiger{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", color='" + color + '\'' +
               '}';
    }
}
