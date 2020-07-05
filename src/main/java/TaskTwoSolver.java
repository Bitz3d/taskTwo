import java.util.*;

public class TaskTwoSolver {

    public static void findPairs(List<Integer> integers, int sum) {
        Map<Integer, Integer> pairs = new HashMap<>();
        Collections.sort(integers);
        integers.forEach(integer -> pairs.put(sum - integer, integer));
        integers.forEach(value -> {
            if (pairs.containsKey(value)) {
                System.out.println(value + " " + pairs.get(value));
                pairs.remove(pairs.get(value));
            }
        });
    }

    // Sorry musiałem użyć brute force :P
    public static void findPairs(Integer[] a, int sum) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] + a[j] == sum)
                    System.out.println(a[i] + " " + a[j]);
            }
        }
    }
}
