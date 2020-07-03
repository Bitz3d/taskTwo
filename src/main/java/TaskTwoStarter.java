
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskTwoStarter {
    private static final int TAKS_TWO_SUM_NUMBER = 13;
    public static void main(String[] args) throws Exception {
        List<Integer> integers = getIntegers();
        TaskTwoSolver.findPairs(integers, TAKS_TWO_SUM_NUMBER);
    }

    public static List<Integer> getIntegers() throws Exception {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        List<Integer> collect;
        try {
            collect = Arrays.stream(inputString.split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new Exception("Insert integers space separated");
        }
        return collect;
    }
}
