public class Human implements Actionable {
    Foot leftFoot, rightFoot;
    Double height;
    Integer age;

    public void act() {

    }

    class Foot {
        Integer height;

        public String toString() {
            Human.this.height = 0.0;
            age = 10;
            return height.toString();
        }
    }
}

interface Actionable {
    void act();
}
