import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer[] IntegierFirstArray = new Integer[]{106,26,81,5,15};
        printArrayMethod(IntegierFirstArray);
        sortArrayMethod(IntegierFirstArray);
        printArrayMethod(IntegierFirstArray);
        IntegierFirstArray = getArrayMethod();
        printArrayMethod(IntegierFirstArray);
        sortArrayMethod(IntegierFirstArray);
        printArrayMethod(IntegierFirstArray);

    }

    private static void printArrayMethod(Integer[] array)
    {
        System.out.println(Arrays.toString(array));
    }
    private static Integer[] sortArrayMethod(Integer[] array)
    {
        Arrays.sort(array,Collections.reverseOrder());
        return array;
    }
    private static Integer[] getArrayMethod()
    {
        Integer[] IntegierFirstArray = new Integer[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ;i<IntegierFirstArray.length;i++)
        {
            IntegierFirstArray[i] = scanner.nextInt();
        }
        return IntegierFirstArray;
    }

}
