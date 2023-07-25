public class Supermane implements CanFly,CanRun,CanSwim{
    private String name;
    private int age;

    public Supermane(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Supermane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;

    }


    @Override
    public void fly() {
        System.out.println("fly is super");

    }

    @Override
    public void Run() {
        System.out.println("Run is super");

    }

    @Override
    public void swim() {
        System.out.println("Swim is super");

    }
}

