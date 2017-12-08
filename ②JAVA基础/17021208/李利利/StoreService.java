import java.util.ArrayList;
import java.util.Scanner;

public class StoreService implements IStore {
	void help() {
		System.out.println("------进销存系统帮助------");
		System.out.println("1.新增商品");
		System.out.println("2.进货");
		System.out.println("3.销售");
		System.out.println("4.参看库存");
		System.out.println("5.退出系统");
	}

	@Override
	public void addStore(ArrayList<Store> arrayList, Scanner sc) {
		String s = sc.next();
		String[] re = s.split(",");
		if (re.length != 4) {
			System.out.println("输入的格式不正确,请重新输入");
		} else {
			Store store = new Store(re[0], re[1], Double.parseDouble(re[2]),
					Double.parseDouble(re[3]));
			arrayList.add(store);
			System.out.println(store.toString());
		}
	}

	@Override
	public void stockStore(ArrayList<Store> arrayList, Scanner sc) {
		System.out.println("请输入商品编号按回车键再输入增加数量");
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
		System.out.println("请输入商品编号按回车键再输入减少数量");
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
