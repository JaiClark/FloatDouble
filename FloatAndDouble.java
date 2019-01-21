/**
 * FloatAndDouble
 */
public class FloatAndDouble {

    public static void main(String[] args) {
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        double myPoundsValue = 200d;
        double myKiloGrams = myPoundsValue * 0.45359237d;

        System.out.println("myKiloGrams = " + myKiloGrams);

        System.out.println("myIntValue = " + myIntValue);

        System.out.println("myFloatValue = " + myFloatValue);

        System.out.println("myDoubleValue  = " + myDoubleValue);
    }
}