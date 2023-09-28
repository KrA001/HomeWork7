public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Medic medic = new Medic();
        Hero[] names = {medic, magic, warrior};
        String[] ability = {"глобальный лечение", "огненный гром", "казнь зла"};
        for (int i = 0; i < names.length; i++) {
            names[i].applySuperAbility(ability[i]);
        }
    }
}