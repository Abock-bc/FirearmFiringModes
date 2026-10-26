public class SafeMode implements FiringMode {

    @Override
    public int roundsFiredOnTriggerPull(int roundsInMagazine) {
        return 0;
    }

    @Override
    public String name() {
        return "SAFE";
    }
}
