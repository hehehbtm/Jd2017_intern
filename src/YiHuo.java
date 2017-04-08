import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
//  异或运算
//    题目链接
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4397&konwledgeId=41
//    利用内置函数，直接将二进制字符串转化为整数
//    题目设置字符串的长度为20位  int的范围是32位，可以偷懒做
//    将字符串的长度最大值提高到64位（long的大小）以上   就不可以这么做了
public class YiHuo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int len = in.nextInt();
            System.out.println(Integer.valueOf(in.next(),2)^Integer.valueOf(in.next(),2));
        }
    }
}
