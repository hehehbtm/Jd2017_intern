import java.util.*;

/**
 * Created by admin on 2017/4/8.
 */
//  �ս���C
//    ��Ŀ����
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4401&konwledgeId=41
//    ����һ  ö�����е�����  ʱ�䳬ʱ
//    ������  �Ľ�����  ö�ٳ���λ��
public class ZJZC {
//    ��һ������ö�� ���� ��ʱ
    public static int helper(int[] start ,int[] end ,int min, int max){
        int res = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = min; i <= max; i++) {
            for (int j = i+1; j < max; j++) {
                tmp = helper1(start,end,i,j);
                if (tmp>res)
                    res = tmp;
            }
        }
        return res;
    }
//    �ڶ������� ö�ٳ���
    public static int helper(int[] start ,int[] end){
        int res = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < end.length; j++) {
                tmp = helper1(start,end,start[i],end[j]);
                if (tmp>res)
                    res = tmp;
            }
        }
        return res;
    }
//    �÷��� ����ֵΪ  ������i,jλ��ʱ���ݻٵĳ�����
    public static int helper1(int[] start,int[] end ,int i,int j){
        int res = 0;
        for (int k = 0; k < start.length; k++) {
            if ((i>=start[k]&&i<end[k])||(j>=start[k]&&j<=end[k]))
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            int[] start = new int[num];
            int[] end = new int[num];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < num; i++) {
                start[i] = in.nextInt();
//                if (start[i]<min)
//                    min = start[i];
                end[i] = in.nextInt()+start[i];
//                if (end[i]>max)
//                    max = end[i];
            }
            System.out.println(helper(start,end));
        }
        in.close();
    }
}
