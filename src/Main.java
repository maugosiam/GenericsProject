import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ThreeNumbers firstObjectWithThreeNumbers = new ThreeNumbers(3,2,1);
        ThreeNumbers secondObjectWithThreeNumbers = new ThreeNumbers(1,2,4);
        ThreeNumbers thirdObjectWithThreeNumbers = new ThreeNumbers(1,2,3);

        ArrayList<Integer> firstObjectWithThreeNumbersArray = new ArrayList();
        firstObjectWithThreeNumbersArray.add(firstObjectWithThreeNumbers.getX());
        firstObjectWithThreeNumbersArray.add(firstObjectWithThreeNumbers.getY());
        firstObjectWithThreeNumbersArray.add(firstObjectWithThreeNumbers.getZ());

        Collections.sort(firstObjectWithThreeNumbersArray);

        firstObjectWithThreeNumbers.setX(firstObjectWithThreeNumbersArray.get(0));
        firstObjectWithThreeNumbers.setY(firstObjectWithThreeNumbersArray.get(1));
        firstObjectWithThreeNumbers.setZ(firstObjectWithThreeNumbersArray.get(2));
        
        System.out.println(firstObjectWithThreeNumbers.compareTo(secondObjectWithThreeNumbers));
        System.out.println(firstObjectWithThreeNumbers.compareTo(thirdObjectWithThreeNumbers));
    }
}
