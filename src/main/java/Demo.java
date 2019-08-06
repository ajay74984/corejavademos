import com.google.common.primitives.ImmutableIntArray;
import com.google.common.primitives.ImmutableLongArray;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

import static java.lang.Double.valueOf;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.plusMinus(new int[]{-4,3,-9, 0,4,1});

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

        int j = elements.size() -1;
        for (int i = 0; i < elements.size() ; i++) {
            sum1 = sum1 + elements.get(i).get(i);
            sum2 = sum2 + elements.get(i).get(j);
            j--;
        }

        System.out.println(sum1);
        System.out.println(sum2);

        return Math.abs(sum2 - sum1);
    }

    private void plusMinus(int[] arr){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = arr.length;
        for(int i= 0; i < size -1; i++){
            if(arr[i] < 0){
                negative = negative +1;
            }else if(arr[i] > 0){
                positive = positive + 1;
            }else {
                zero = zero +1;
            }
        }

       // System.out.println("%.3f %n", valueOf(positive/size));
        System.out.println(valueOf(negative/size));
        System.out.println(valueOf(zero/size));
    }
}
