package 自动类型转换;
/**
 * Java中的基本数据类型之间可以进行转换
  * 自动类型转换需要满足特定的条件：
  * 1、目标类型能与源类型兼容(如double可以兼容int)
  * 2、目标类型大于源类型(double类型长度为8字节，int类型为4字节)
 * @author scepter
 * @Date 2018年5月16日 下午6:09:31
 *
 */
public class 自动类型转换 {
	public static void main(String[] args) {
		int num1=12;//声明int类型变量num1，并赋值12
		double num2=num1;//将int类型变量num1转换为double类型
		System.out.println(num2);
	}
}
