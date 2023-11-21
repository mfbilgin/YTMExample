package builderPattern;

class ConcreteCharacterBuilder implements CharacterBuilder {
    private Character character;

    public ConcreteCharacterBuilder() {
        this.character = new Character("", "", "", "");
    }

    @Override
    public CharacterBuilder setName(String name) {
        character.setName(name);
        return this;
    }

    @Override
    public CharacterBuilder setRole(String role) {
        character.setRole(role);
        return this;
    }

    @Override
    public CharacterBuilder setWeapon(String weapon) {
        character.setWeapon(weapon);
        return this;
    }

    @Override
    public CharacterBuilder setArmor(String armor) {
        character.setArmor(armor);
        return this;
    }

    @Override
    public Character build() {
        return character;
    }
}