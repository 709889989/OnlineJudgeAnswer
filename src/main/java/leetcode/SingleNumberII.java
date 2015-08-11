package leetcode;

/**
 * Created by qinjuntao on 2015/8/10.
 * https://leetcode.com/problems/single-number-ii/
 */
public class SingleNumberII {
    public class Solution {
        public int singleNumber(int[] nums) {
            int one = 0;//�洢����1�ε�bitλ
            int two = 0;//�洢����2�ε�bitλ
            int three = 0;//�洢����3�ε�bitλ
            for (int i = 0; i < nums.length; ++i) {
                two |= (one & nums[i]);//��ǰ���ݺ�����ģ�����1�εĹ���bitλ�����µĳ���2�ε�bitλ
                one ^= nums[i];//��ǰ���ݺ�����ģ�����1�εĲ�ͬ��bitλ������֮�����1�ε�bitλ
                three = (one & two);//�ó�����3�ε�bitλ
                one &= (~three);//���ƶ�3ȡģ�Ĳ���
                two &= (~three);//���ƶ�3ȡģ�Ĳ���
            }
            return one | two;//Ψһ�������ܳ���1�λ���2��
        }
    }
}
