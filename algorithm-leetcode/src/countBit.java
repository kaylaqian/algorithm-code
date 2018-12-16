import java.util.Arrays;

/*
338.
Given a non negative integer number num.
For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation
and return them as an array.
eg. 6->[1,1,0] -> 4[1,0,0] -> 2[1,0]
 */
public class countBit {
    public int[] countBit(int input) {
        int[] res = new int[input + 1];
        for (int i = 1; i<= input; i++) {
            if (i % 2 == 0) {
                res[i] = res[i>>1];
            } else {
                res[i] = res[i-1] + 1;
            }
        }
        return res;
    }
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        for (int j = 1; j <= num; j <<= 1)
        {
            for (int i = 0; i < j; i++)
            {
                if (i + j > num)
                    return ret;
                ret[j + i] = ret[i] + 1;
            }
        }
        return ret;
    }
    public static void main(String args[]) {
        countBit test = new countBit();
        Arrays.asList(test.countBits(4)).stream().forEach(s -> System.out.println(s));
    }
}
