public class TrimmerDecorator extends BaseDecor{
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }
    public String correctName(){
        String name=nameable.correctName();
        if(name.length()>10){
            return name.substring(0,10);
        }
        else{
            return name;
        }
    }
}
