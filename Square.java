public class Square {
    public static void main(String[] args) {

        int side1 = 4;
        int area1 = side1 * side1;
        int periSquare1 = side1 * 4;
        boolean booleanValue1 = (area1 == periSquare1);

        String line1 = "Периметр равен площади";
        System.out.println(line1 + " : " + booleanValue1);

        int side2 = 2;
        int area2 = side2 * side2;
        int periSquare2 = side2 * 4;
        boolean booleanValue2 = (area2 == periSquare2);

        String line2 = "Периметр равен площади";
        System.out.println(line2 + " : " + booleanValue2);

    }
}
