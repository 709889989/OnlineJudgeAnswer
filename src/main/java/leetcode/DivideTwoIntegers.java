package leetcode;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/divide-two-integers/
 */
public class DivideTwoIntegers {
    public class Solution {
        public int divide(int dividend, int divisor) {
            if (divisor == 0) return Integer.MAX_VALUE; //����Ϊ0���쳣
            int res = 0;
            int tmp;
            if (dividend == Integer.MIN_VALUE) {
                res = 1;
                dividend += Math.abs(divisor);
            }
            if (divisor == Integer.MIN_VALUE) {//�����ĸΪ
                return res;
            }
            int a = Math.abs(dividend);
            int b = Math.abs(divisor);
            for (; a >= b; ) {
                tmp = b;
                for (int i = 0; a >= tmp; ++i, tmp <<= 1) {
                    a -= tmp;
                    res += 1 << i;
                }
            }
            return ((dividend ^ divisor) >> 31) > 0 ? (-res) : (res);//ͨ����ߵ����ֵȷ�����������
        }
    }
}
