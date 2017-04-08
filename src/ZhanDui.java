import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
//  վ��
//    ��Ŀ���ӣ�
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4400&konwledgeId=41
//    ��Ŀ�ⷨ����һ������mark�����
//   mark = 0  ��λΪ�����ƽ��
//    mark = 1 Ϊ��
//    mark = 2 Ϊ��������   �����ظ�����
//    ����ʱ Ϊ����Ϳ�ʼ������Χ��ע������Խ������
public class ZhanDui {
    public static int helper(String str, int len){
        int res = 0;
        int[] mark = new int[len];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='X')
                mark[i] = 1;
        }
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i)-'0';
            if (num>=0&&num<=9){
//              ��ֹԽ��
                int start = i - num<0?0:i-num;
                int end = i + num>=len-1?len-1:i+num;
                for (int j = start; j <= end; j++) {
                    if (mark[j]==1){
                        mark[j] = 2;
                        res++;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int len = in.nextInt();
            String str = in.next();
            System.out.println(helper(str,len));
        }
    }
}
