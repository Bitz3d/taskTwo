import java.util.Arrays;
import java.util.Scanner;

public class TaskTwoStarter {
    private static final int TAKS_TWO_SUM_NUMBER = 13;

    public static void main(String[] args) throws Exception {
        Integer[] integers = getIntegers();
        TaskTwoSolver.findPairs(integers, TAKS_TWO_SUM_NUMBER);
    }

    public static Integer[] getIntegers() throws Exception {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        Integer[] collect;
        try {
            collect = Arrays.stream(inputString.split(" "))
                    .map(Integer::valueOf).toArray(Integer[]::new);
        } catch (Exception e) {
            throw new Exception("Insert integers space separated");
        }
        return collect;
    }
}
