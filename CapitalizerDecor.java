public class CapitalizerDecor extends BaseDecor {

    public CapitalizerDecor(Nameable nameable) {
        super(nameable);
    }
    public String correctName() {
        String name = nameable.correctName();
        return name.toUpperCase();
    }

}

