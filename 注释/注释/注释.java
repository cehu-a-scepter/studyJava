package 注释;
/**
 * Java中的注释有3种类型
 * 分别是：单行注释、多行注释、文档注释
 * @author scepter
 *	@Date 2018年5月19日 下午12:48:31
 */
public class 注释 {
	public static void main(String[] args) {
		System.out.println("文档注释以/**开头*/结尾，可注释多行，可用javadoc导出");
		System.out.println("多行注释以/*开头*/结尾，用于注释多行");
		System.out.println("单行注释以//换行结尾，//后的所有内容均会被注释");
	}
}  