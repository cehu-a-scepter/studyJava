package 条件语句;
/**
 * Java条件语句值switch语句
 * 语句格式：
 * switch(表达式){
 * 		case 值：
 * 			代码
 * 			break;
 * 		default:
 * 			默认代码
 * }
 * 解析：将'值'与'表达式'比较
 * 若值相等，则执行相应的case中的代码
 * 若没有匹配的则执行default中的默认代码
 * @author scepter
 *	@Date 2018年5月20日 下午3:08:13
 */
public class switch语句 {
	public static void main(String[] args) {
		int a=2;//定义一个变量a并赋值
		switch(a) {//switch(这里的值必须是整型或字符型)
		case 1://case后的值可以是常量数值，也可以是常量表达式
			System.out.println("a的值为1");
			break;//若没有break;则会执行下面所有case中的代码直到switch结束或遇到break
		case 2:
			System.out.println("a的值为2");
			break;
		default://若没有匹配的case则执行此默认代码
			System.out.println("a的值未知");
		}
	}
}