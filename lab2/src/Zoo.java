import java.util.List;
import java.util.Objects;

/**
 * Class representing a zoo, which contains various animals.
 */
public class Zoo {
    private String name;
    private String location;
    private List<Animal> animals;

    /**
     * Private constructor for the Zoo, used by the Builder.
     *
     * @param builder the builder object for constructing Zoo
     */
    private Zoo(ZooBuilder builder) {
        this.name = builder.name;
        this.location = builder.location;
        this.animals = builder.animals;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', location='" + location + "', animals=" + animals + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return name.equals(zoo.name) &&
                location.equals(zoo.location) &&
                animals.equals(zoo.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, animals);
    }

    /**
     * Builder class for Zoo.
     */
    public static class ZooBuilder {
        private String name;
        private String location;
        private List<Animal> animals;

        /**
         * Sets the name of the zoo.
         *
         * @param name the name of the zoo
         * @return the builder instance
         */
        public ZooBuilder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the location of the zoo.
         *
         * @param location the location of the zoo
         * @return the builder instance
         */
        public ZooBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the list of animals in the zoo.
         *
         * @param animals the list of animals
         * @return the builder instance
         */
        public ZooBuilder setAnimals(List<Animal> animals) {
            this.animals = animals;
            return this;
        }

        /**
         * Builds and returns the Zoo object.
         *
         * @return a new instance of Zoo
         */
        public Zoo build() {
            return new Zoo(this);
        }
    }
}
