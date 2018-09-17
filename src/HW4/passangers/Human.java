package HW4.passangers;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeDog(Dog dog) {
        StringBuffer stringBuffer = new StringBuffer("Взял собаку ");
        System.out.println(stringBuffer.append(name));
    }
}
