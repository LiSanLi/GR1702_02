import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Store> arrayList = new ArrayList<Store>();
		StoreService st = new StoreService();
		st.help();

		int key = 0;
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入指令,并按回车键");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入新增商品的信息");
				st.addStore(arrayList, sc);
				break;
			case 2:
				System.out.println("进货的信息");
				st.stockStore(arrayList, sc);
				break;
			case 3:
				System.out.println("销售的信息");
				st.removeStore(arrayList, sc);
				break;
			case 4:
				System.out.println("参看库存信息");
				st.infoStore(arrayList);
				break;
			case 5:
				isQuit = false;
				break;

			default:
				break;
			}
		}
		System.out.println("退出系统了,拜拜哦");
	}

}
