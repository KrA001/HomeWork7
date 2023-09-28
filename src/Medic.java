public class Medic extends Hero{
    private String superAbilityType;

    public Medic(int heal, int damage, String superAbilityType) {
        super(heal, damage, superAbilityType);
    }

    public Medic(String superAbilityType){
        this.superAbilityType = superAbilityType;
    }
    public Medic() {
    }

    public void superAbilityType(){
        System.out.println("Medic применил" + getSuperAbilityType());
    }
    @Override
    public void applySuperAbility(String superAbilityTyre) {
        System.out.println("Medic применил " + superAbilityTyre);
    }
}
