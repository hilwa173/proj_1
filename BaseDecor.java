public class BaseDecor implements Nameable {
    Nameable nameable;

    public BaseDecor(Nameable nameable) {
        this.nameable = nameable;
    }

    @Override
    public String correctName() {
        return nameable.correctName();
    }
}





