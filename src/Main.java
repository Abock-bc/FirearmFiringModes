public class Main {

    public static void main(String[] args) {
        Firearm rifle = new Firearm(new SafeMode(), 30);
        rifle.pullTrigger();

        rifle.setFiringMode(new SemiAutoMode());
        rifle.pullTrigger();

        rifle.setFiringMode(new BurstMode());
        rifle.pullTrigger();

        rifle.setFiringMode(new FullAutoMode());
        rifle.pullTrigger();
        rifle.pullTrigger();
    }
}
