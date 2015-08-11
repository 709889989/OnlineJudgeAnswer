package leetcode;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public class Solution {
        public int removeElement(int[] nums, int val) {
            int first = 0;
            int last = nums.length - 1;
            int len = nums.length; //����[2],1�����鲻����ɾ���������������Ĭ��Ϊԭ���鳤��
            int tmp;
            for (; ; ) {
                for (; first < nums.length && nums[first] != val; ++first) ;
                for (; last >= 0 && nums[last] == val; --last) ;
                len = first; //����[1],1�����鶼��ɾ���������������Ϊ��ʼֵ
                if (last <= first) break;
                tmp = nums[first];
                nums[first] = nums[last];
                nums[last] = tmp;
                ++first;
                --last;
                len = first;
            }
            return len;
        }
    }
}
