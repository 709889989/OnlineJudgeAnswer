package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/majority-element-ii/
 * Ħ��ͶƱ��
 * Ħ��ͶƱ���Ļ���˼��ܼ򵥣���ÿһ��ͶƱ�����У����������ҳ�һ�Բ�ͬ��Ԫ�أ������������ɾ����
 * �������ϵ�ɾ��ֱ���޷��ٽ���ͶƱ���������Ϊ�գ���û���κ�Ԫ�س��ֵĴ������������鳤�ȵ�һ�롣
 * ���ֻ����һ��Ԫ�أ���ô���Ԫ�������ΪĿ��Ԫ�ء�
 */
public class MajorityElementII {
    public class Solution {
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> res = new ArrayList<Integer>();
            int a = 0;
            int countA = 0;
            int b = 0;
            int countB = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == a) ++countA;
                else if (nums[i] == b) ++countB;
                else if (countA <= 0) {
                    a = nums[i];
                    countA = 1;
                } else if (countB <= 0) {
                    b = nums[i];
                    countB = 1;
                } else {
                    --countA;
                    --countB;
                }
            }
            if (a == b) b = a - 1;//a=0,b=0�����
            countA = 0;
            countB = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == a) ++countA;
                else if (nums[i] == b) ++countB;
            }
            if (countA > nums.length / 3) res.add(a);
            if (countB > nums.length / 3) res.add(b);
            return res;
        }
    }
}
