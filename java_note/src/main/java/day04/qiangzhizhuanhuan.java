package day04;

/**
 * ǿ��ת��
 *
 * ������ǿ��ת�� ����ǰ����ת������������  ǿת��()
 *
 *
 */

public class qiangzhizhuanhuan {

    public static void  main(String[] a){

        double d1 =17.9;
        double d2 =17.1;
/*        �ض� 1. �������������,2. ���ܵ�����ʧ����
          ǿ��ת�� ����ǰ����ת������������
 */
        int i = (int) d1;
        int i1 = (int) d2;
        System.out.println(i);
        System.out.println(i1);

        long L1 = 111;
        short s2 = (short)L1;
//        û�о�����ʧ

        int c1 = 1200;
        byte bb =(byte)c1;
        System.out.println(bb); //-128

        /*
        �������
         */
        long ll = 1234;  //Ĭ����int ת����Ϊlong�������ֵ�����Ҫ��L ����ͻ���벻ͨ��  ����
        //long l2 =999999999;
        System.out.println(ll);

        /*
        ������Ĭ����double��  float ����f�ǲ��еĻ����ʧ�ܵ�   float ��double�ķ�ΧС
         */
//        float ff = 11.1;
        float f1 = 11.2f;

        //���ͳ����ǣ� int
        byte b2 = 1;
//        byte b1 = b2 +1; ���벻ͨ��
        int ii = b2 +1;
        System.out.println(ii);

//        float ff1 =f1 + 1.1; ���벻ͨ��
        double ff1 =f1 + 1.1;
        System.out.println(ff1);

    }
}
