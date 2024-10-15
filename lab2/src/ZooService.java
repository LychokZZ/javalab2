import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service class for managing Zoo and Animal collections.
 */
public class ZooService {

    /**
     * Метод для отримання списку тварин за заданим видом.
     *
     * @param zoo     зоопарк, з якого отримуються тварини
     * @param species вид тварини для фільтрації
     * @return список тварин, що відповідають заданому виду
     */
    public List<Animal> getAnimalsBySpecies(Zoo zoo, String species) {
        return zoo.getAnimals().stream()
                .filter(animal -> animal.getSpecies().equalsIgnoreCase(species))
                .collect(Collectors.toList());
    }

    /**
     * Метод для отримання тварин, відсортованих за віком.
     *
     * @param zoo зоопарк, з якого отримуються тварини
     * @return список тварин, відсортованих за віком
     */
    public List<Animal> getAnimalsSortedByAge(Zoo zoo) {
        return zoo.getAnimals().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Метод для групування тварин за видами.
     *
     * @param zoo зоопарк, з якого отримуються тварини
     * @return мапа, де ключ - вид тварини, а значення - список тварин цього виду
     */
    public Map<String, List<Animal>> groupAnimalsBySpecies(Zoo zoo) {
        return zoo.getAnimals().stream()
                .collect(Collectors.groupingBy(Animal::getSpecies));
    }
}
