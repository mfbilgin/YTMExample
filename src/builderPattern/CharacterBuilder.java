package builderPattern;

interface CharacterBuilder {
    CharacterBuilder setName(String name);
    CharacterBuilder setRole(String role);
    CharacterBuilder setWeapon(String weapon);
    CharacterBuilder setArmor(String armor);
    Character build();
}
