import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Створення тварин
        Animal lion = new Animal("Leo", "Lion", 5);
        Animal elephant = new Animal("Ella", "Elephant", 10);
        Animal tiger = new Animal("Tina", "Tiger", 3);
        Animal lioness = new Animal("Lila", "Lion", 4);

        // Додавання тварин до списку
        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(elephant);
        animals.add(tiger);
        animals.add(lioness);

        // Створення зоопарку за допомогою Builder
        Zoo zoo = new Zoo.ZooBuilder()
                .setName("City Zoo")
                .setLocation("New York")
                .setAnimals(animals)
                .build();

        // Створення сервісу зоопарку
        ZooService zooService = new ZooService();

        // Отримання тварин за видом
        List<Animal> lions = zooService.getAnimalsBySpecies(zoo, "Lion");
        System.out.println("Lions in the zoo: " + lions);

        // Отримання тварин, відсортованих за віком
        List<Animal> sortedAnimals = zooService.getAnimalsSortedByAge(zoo);
        System.out.println("Animals sorted by age: " + sortedAnimals);

        // Групування тварин за видами
        Map<String, List<Animal>> groupedAnimals = zooService.groupAnimalsBySpecies(zoo);
        System.out.println("Grouped animals by species: " + groupedAnimals);
    }
}
