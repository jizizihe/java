import java.util.*;
public class ArrayUse {
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[8];
		/* 填充数组：fill的使用 */
		System.out.println("-----填充数组：fill的使用------");
		Arrays.fill(a, 11);//将数组a的数值全部填充为11
		Arrays.fill(b, 22);
		System.out.println("a="+Arrays.toString(a));
		System.out.println("b="+Arrays.toString(b));
		/* 复制数组：System.arraycopy的使用 */
		System.out.println("-----复制数组：System.arraycopy的使用------");
		System.arraycopy(a, 0, b, 0, a.length);//将a数组的第0位开始依次复制到b数组的第0位开始，直到a.length。
		System.out.println("b="+Arrays.toString(b));
		/* 数组比较:Arrays.equals */
		System.out.println("-----数组比较：Arrays.equals------");
		int c[] = new int[5];
		int d[] = new int[5];
		Arrays.fill(c, 33);
		Arrays.fill(d, 33);
		System.out.println("c = d:"+Arrays.equals(c, d));
		d[2] = 22;
		System.out.println("c != d:"+Arrays.equals(c, d));
		/* 数组排序:Arrays.sort */
		System.out.println("-----数组排序：Arrays.sort------");
		String[] str = {"Sttsdfs", "adffsdf", "Asdfsaf", "Swirl", "MintChip", "Mintss", "mint", "zsdfdsf"};
		System.out.println("before sort: "+Arrays.toString(str));
		Arrays.sort(str);	
		System.out.println("after sort: "+Arrays.toString(str));
	}
}
