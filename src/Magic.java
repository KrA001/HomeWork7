public class Magic extends Hero {
    private String superAbilityType;

    public Magic(int heal, int damage, String superAbilityType) {
        super(heal, damage, superAbilityType);
    }

    public Magic() {
    }

    public Magic(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    public void superAbilityType() {
        System.out.println("Magic применил" + getSuperAbilityType());
    }
        @Override
        public void applySuperAbility(String superAbilityTyre) {
            System.out.println("Magic применил " + superAbilityTyre);
        }

}
