package leetcode;

/**
 * Created by qinjuntao on 2015/8/17.
 * https://leetcode.com/problems/add-digits/
 * ���ϣ�https://en.wikipedia.org/wiki/Digital_root
 * ���취
 * ���ָ�
 * �κ�һ������ģ9ͬ�������ĸ���λ������֮��
 * ����n!=9ʱ��f(n)=n%9����n=9ʱ��f(n)=9
 * ��Ϊf(n+1)=(n+1)%9=(n%9+1)%9
 * ����f(n)=((n-1)%9+1)%9 ȥ�������%9�ͱ�����n=9ʱ,f(9)=0������
 */
public class AddDigits {
    public class Solution {
        public int addDigits(int num) {
            if (num == 0) return 0;
            else return (num - 1) % 9 + 1;
        }
    }
}
