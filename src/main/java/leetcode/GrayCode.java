package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/gray-code/
 * <p/>
 * ��������������루���룩��
 * �˷����Ӷ�Ӧ��nλ������������ֱ�ӵõ�nλ���������֣��������£�
 * ��nλ�����Ƶ����֣����ҵ�����0��n-1���
 * ������������ֵĵ�iλ��i+1λ��ͬ�����Ӧ�ĸ�����ĵ�iλΪ0������Ϊ1����i+1=nʱ�����������ֵĵ�nλ����Ϊ��0������n-1λ���䣩[3]
 * ��ʽ��ʾ����G�������룬B���������룩
 * <p/>
 * ��������������루���룩��
 * ����ߵڶ�λ�𣬽�ÿλ�����һλ������ֵ�����Ϊ��λ������ֵ�������һλ��Ȼ���䣩���������ֱ�����λ���������ת�����ֵ���������������Ǹ�����ת������������ֵ��
 * ��ʽ��ʾ����G�������룬B���������룩
 */
public class GrayCode {
    public class Solution {
        public List<Integer> grayCode(int n) {
            int len = 1 << n;
            List<Integer> res = new ArrayList<Integer>(len);
            for (int i = 0; i < len; ++i) {
                int tmp = i ^ (i >> 1);
                res.add(tmp);
            }
            return res;
        }
    }
}
