import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
//  �������
//    ��Ŀ����
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4397&konwledgeId=41
//    �������ú�����ֱ�ӽ��������ַ���ת��Ϊ����
//    ��Ŀ�����ַ����ĳ���Ϊ20λ  int�ķ�Χ��32λ������͵����
//    ���ַ����ĳ������ֵ��ߵ�64λ��long�Ĵ�С������   �Ͳ�������ô����
public class YiHuo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int len = in.nextInt();
            System.out.println(Integer.valueOf(in.next(),2)^Integer.valueOf(in.next(),2));
        }
    }
}
