package model;
import model.Animal;
import enums.Habitat;
import enums.TrainingLevel;

public class Dog extends Animal {
    private String breed;
    private boolean isVaccinated;
    private TrainingLevel trainingLevel;
    private String ownerName;
    private int barkVolume;

    public Dog(String name, int age, double weight, String breed, boolean isVaccinated, TrainingLevel trainingLevel, String ownerName, int barkVolume) {
        super(name, speed:48, age, weight, Habitat.DOMESTIC, isWild: false);
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        
    }
}
