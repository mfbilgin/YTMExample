package builderPattern;

public class Main {
    public static void main(String[] args) {
        CharacterBuilder characterBuilder = new ConcreteCharacterBuilder();
        Character character = characterBuilder
            .setName("John")
            .setRole("Warrior")
            .setWeapon("Sword")
            .setArmor("Plate")
            .build();
        System.out.println(character);
    }
}
