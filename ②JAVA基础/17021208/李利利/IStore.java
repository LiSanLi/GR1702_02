import java.util.ArrayList;
import java.util.Scanner;

public interface IStore {

	void addStore(ArrayList<Store> arrayList, Scanner sc);

	void stockStore(ArrayList<Store> arrayList, Scanner sc);

	void removeStore(ArrayList<Store> arrayList, Scanner sc);

	void infoStore(ArrayList<Store> arrayList);

}
