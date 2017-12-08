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
			System.out.println("������ָ��,�����س���");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("������������Ʒ����Ϣ");
				st.addStore(arrayList, sc);
				break;
			case 2:
				System.out.println("��������Ϣ");
				st.stockStore(arrayList, sc);
				break;
			case 3:
				System.out.println("���۵���Ϣ");
				st.removeStore(arrayList, sc);
				break;
			case 4:
				System.out.println("�ο������Ϣ");
				st.infoStore(arrayList);
				break;
			case 5:
				isQuit = false;
				break;

			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ��,�ݰ�Ŷ");
	}

}
