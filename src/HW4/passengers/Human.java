package HW4.passengers;

/**
 * Class describes bus passengers that can take a dog at bus.
 */
public class Human {

    private String name;
    private String template = null;


    public String getTemplate() {
        return template;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Dog can't get on the bus without human
     *
     * @param dog use object type Dog
     */
    public void takeDog(Dog dog) {
        template = name;
        StringBuffer humanName = new StringBuffer(name);
        StringBuffer dogName = new StringBuffer(dog.getName());

        System.out.println(humanName.append(" take in his arms the dog ").append(dogName));


    }
}