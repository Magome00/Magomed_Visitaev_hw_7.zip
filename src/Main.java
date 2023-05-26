public class Main {
    public static void main(String[] args){
        Medic medic= new Medic();
        Magic magic= new Magic();
        Warrior warrior= new Warrior();
        HavingSuperAbility[] superAbilities={medic,magic,warrior};
        for (int i = 0; i < superAbilities.length; i++) {
          superAbilities[i].applySuperAbility();
        }
    }
}
