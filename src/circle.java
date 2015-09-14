
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class circle {

	private static double p=Math.PI;//获取圆周率
	public static void main(String args[]) throws IOException {
		System.out.println("请输入圆的半径：");
		Scanner in=new Scanner(System.in);//输人圆的半径
		double r=in.nextDouble();
		double area=p*r*r;//计算圆的面积
		System.out.println("圆的面积为："+area);//打印出圆的面积
		/**
		 * 创建一个输入流 并将文件写入到t.txt文档中
		 */
		FileWriter f=new FileWriter("t.txt");
		String str="";  //初始化字符串
		str+=area;  //将圆的面积赋值给str
		f.write(str);  //将str内容写入t.txt文档中
		f.close();
	}
}	