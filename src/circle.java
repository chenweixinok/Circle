
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class circle {

	private static double p=Math.PI;//��ȡԲ����
	public static void main(String args[]) throws IOException {
		System.out.println("������Բ�İ뾶��");
		Scanner in=new Scanner(System.in);//����Բ�İ뾶
		double r=in.nextDouble();
		double area=p*r*r;//����Բ�����
		System.out.println("Բ�����Ϊ��"+area);//��ӡ��Բ�����
		/**
		 * ����һ�������� �����ļ�д�뵽t.txt�ĵ���
		 */
		FileWriter f=new FileWriter("t.txt");
		String str="";  //��ʼ���ַ���
		str+=area;  //��Բ�������ֵ��str
		f.write(str);  //��str����д��t.txt�ĵ���
		f.close();
	}
}	