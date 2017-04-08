import java.util.*;

/**
 * Created by admin on 2017/4/8.
 */
//  终结者C
//    题目链接
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4401&konwledgeId=41
//    方法一  枚举所有的坐标  时间超时
//    方法二  改进做法  枚举车的位置
public class ZJZC {
//    第一种做法枚举 坐标 超时
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
//    第二种做法 枚举车辆
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
//    该方法 返回值为  激光在i,j位置时，摧毁的车辆数
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
