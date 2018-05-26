package 强制类型转换;
/**
 * 将无法自动类型转化的数据强制转换
 * 例如将double类型变量的值强制赋给int类型变量
 * 因为double类型(8字节)大于int类型(4字节)，所以无法自动转换
 * 需注意，强制类型转换会导致数据丢失！
 * @author scepter
 *	@Date 2018年5月19日 上午12:11:24
 */
public class 强制类型转换 {
	public static void main(String[] args) {
		double a=12.72;//定义一个double类型变量a并赋值12.72
		int b=(int)a;//将变量a强制转换为int类型并赋值给变量b
		System.out.println(b);//强制转换导致数据类型丢失，未四舍五入，直接抹掉了小数点后数值
	}
}