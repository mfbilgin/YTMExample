package builderPattern;

class CharacterDirector {
    private final CharacterBuilder characterBuilder;

    public CharacterDirector(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public Character construct() {
        return characterBuilder.setName("Kahraman")
                .setRole("Savaşçı")
                .setWeapon("Kılıç")
                .setArmor("Zırh")
                .build();
    }
}

