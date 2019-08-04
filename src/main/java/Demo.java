import com.google.common.primitives.ImmutableIntArray;
import com.google.common.primitives.ImmutableLongArray;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();

        //demo.bigSum(ImmutableLongArray.of(10000002, 10000001, 10000003, 100004));
    }

    private long bigSum(ImmutableLongArray of) {

        long[] ar = new long[]{45345454,5353454,353534344};
        Arrays.stream(ar).sum();
        return of.stream().sum();
    }


    private int sum(List<List<Integer>> elements){
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < elements.size() ; i++) {
            int j = elements.size() -1;
            sum1 = sum1 + elements.get(i).get(i);
            sum2 = sum2 + elements.get(i).get(j);
            j--;
        }

        System.out.println(sum1);
        System.out.println(sum2);

        return Math.abs(sum2 - sum1);
    }
}
