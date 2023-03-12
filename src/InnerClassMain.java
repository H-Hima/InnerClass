public class InnerClassMain {
    public static void main(String[] args) {
        class MyActionable implements Actionable {
            @Override
            public void act() {

            }
        }
        MyActionable myObject1 = new MyActionable();

        Actionable myObject = new Actionable() {
            @Override
            public void act() {

            }
        };
    }
}
