import java.util.ArrayList;
import java.util.Scanner;

public class StoreService implements IStore {
	void help() {
		System.out.println("------������ϵͳ����------");
		System.out.println("1.������Ʒ");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.�ο����");
		System.out.println("5.�˳�ϵͳ");
	}

	@Override
	public void addStore(ArrayList<Store> arrayList, Scanner sc) {
		String s = sc.next();
		String[] re = s.split(",");
		if (re.length != 4) {
			System.out.println("����ĸ�ʽ����ȷ,����������");
		} else {
			Store store = new Store(re[0], re[1], Double.parseDouble(re[2]),
					Double.parseDouble(re[3]));
			arrayList.add(store);
			System.out.println(store.toString());
		}
	}

	@Override
	public void stockStore(ArrayList<Store> arrayList, Scanner sc) {
		System.out.println("��������Ʒ��Ű��س�����������������");
		String s = sc.next();

		for (int i = 0; i < arrayList.size(); i++) {
			if (s.equals(arrayList.get(i).getId())) {
				double re = sc.nextDouble();
				arrayList.get(i).setNumber(arrayList.get(i).getNumber() + re);
			}
		}
		infoStore(arrayList);

	}

	@Override
	public void removeStore(ArrayList<Store> arrayList, Scanner sc) {
		System.out.println("��������Ʒ��Ű��س����������������");
		String s = sc.next();

		for (int i = 0; i < arrayList.size(); i--) {
			if (s.equals(arrayList.get(i).getId())) {
				double re = sc.nextDouble();
				arrayList.get(i).setNumber(arrayList.get(i).getNumber() - re);
			}
		}
		infoStore(arrayList);

	}

	@Override
	public void infoStore(ArrayList<Store> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}

	}

}
