package 常量的应用;
/***
 * 常量可以理解为一种特殊的变量
 * 它的值设定后在程序运行过程中不允许改变
 * 语法：final 常量名 = 值;
 * 命名规范：常量名一般使用大写字符
 * 特点：程序中使用常量可以提高代码的可维护性
 * 例如在开发时，需要指定用户性别
 * 此时便可定义常量final String MAN="男";
 * 在需要指定用户性别时直接调用此常量
 * 避免了由于用户的不规范赋值导致的程序出错
 * @author scepter
 *	@Date 2018年5月19日 上午12:21:26
 */
public class 常量的应用 {
	public static void main(String[] args) {
		final String MAN="男";
		System.out.println(MAN);
	}
}
