import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayBT mang1 = new ArrayBT();
        mang1.SumEvenNumberArrays(new int []{5,1,6,7,8,10,15,21});
        mang1.maxInArray(new int []{5,1,6,7,8,10,15,21});
        mang1.CountOccurrences(new int []{5,1,1,6,7,8,10,15,1,21},(1));
        ArrayList<Integer> list = new ArrayList<>();
        mang1.sumOfSquaresElements(list);
    }
}
