import java.util.Objects;

/**
 * Class representing an animal in the zoo.
 */
public class Animal implements Comparable<Animal> {
    private String name;
    private String species;
    private int age;

    /**
     * Constructor for creating an animal.
     *
     * @param name    the name of the animal
     * @param species the species of the animal
     * @param age     the age of the animal
     */
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', species='" + species + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                name.equals(animal.name) &&
                species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, age);
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }
}
