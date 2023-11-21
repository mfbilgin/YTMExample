package builderPattern;

class Character {
    private String name;
    private String role;
    private String weapon;
    private String armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public Character(String name, String role, String weapon, String armor) {
        this.name = name;
        this.role = role;
        this.weapon = weapon;
        this.armor = armor;
    }

    // Diğer getter ve setter metotları...

    @Override
    public String toString() {
        return "Character [Name=" + name + ", Role=" + role + ", Weapon=" + weapon + ", Armor=" + armor + "]";
    }
}
