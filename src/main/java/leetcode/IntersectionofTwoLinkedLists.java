package leetcode;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * �ֱ�����������ȣ��賤�ĳ���Ϊa,�̵ĳ���Ϊb���ó�����ǰ��a-b����Ȼ��ͬʱ��ʼǰ����ÿ���Ƚ���������Ƿ���ͬ����ͬ��Ϊ�⡣
 */
public class IntersectionofTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        private int getLen(ListNode root) {
            int i = 0;
            for (; root != null; root = root.next, ++i) ;
            return i;
        }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = getLen(headA);
            int lenB = getLen(headB);
            ListNode longIdx = lenA > lenB ? headA : headB;
            ListNode shortIdx = lenA > lenB ? headB : headA;
            int len = lenA > lenB ? (lenA - lenB) : (lenB - lenA);
            for (int i = 0; i < len; longIdx = longIdx.next, ++i) ;
            for (; longIdx != null && shortIdx != null; longIdx = longIdx.next, shortIdx = shortIdx.next) {
                if (longIdx == shortIdx) {
                    return longIdx;
                }
            }
            return null;
        }
    }
}
