public class FullAutoMode implements FiringMode {

    private static final int ROUNDS_PER_TRIGGER_HOLD = 10;

    @Override
    public int roundsFiredOnTriggerPull(int roundsInMagazine) {
        return Math.min(ROUNDS_PER_TRIGGER_HOLD, roundsInMagazine);
    }

    @Override
    public String name() {
        return "full-auto";
    }
}
