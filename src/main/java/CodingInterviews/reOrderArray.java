package CodingInterviews;

/**
 * ��������˳��ʹ����λ��ż��ǰ��
 * Created by qinjuntao on 2015/8/27.
 */
public class ReOrderArray {
    public class Solution {
        public void reOrderArray(int[] array) {
            int[] res=new int[array.length];
            int idx=0;
            for(int i=0;i<array.length;++i)
                if(array[i]%2==1)
                    res[idx++]=array[i];
            for(int i=0;i<array.length;++i)
                if(array[i]%2!=1)
                    res[idx++]=array[i];
            for(int i=0;i<array.length;++i)
                array[i]=res[i];
        }
    }
}
