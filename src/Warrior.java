public class Warrior extends Hero{
    private String superAbilityType;


    public Warrior(int heal, int damage, String superAbilityType) {
        super(heal, damage, superAbilityType);
    }

    public Warrior() {
    }
    public Warrior(String superAbilityType){
        this.superAbilityType = superAbilityType;
    }

    public void superAbilityType(){
        System.out.println("Warrior применил" + getSuperAbilityType());
    }

    @Override
    public void applySuperAbility(String superAbilityTyre) {
        System.out.println("Warrior применил " + superAbilityTyre);
    }
}
