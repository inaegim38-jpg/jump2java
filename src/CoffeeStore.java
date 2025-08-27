import java.util.Scanner;

public class CoffeeStore {

    public static void main(String[] args) {
        CoffeeM coffeeM = new CoffeeM();
        coffeeM.insertItem(CoffeeType.CAFE_LATTE.name(), 1000);
        coffeeM.insertItem(CoffeeType.ICE_AMERICANO.name(), 1500);
        coffeeM.insertItem(CoffeeType.AMERICANO.name(), 1200);

        for (String itemName : coffeeM.itemlist.keySet()){
            System.out.println(itemName + " : " + coffeeM.itemlist.get(itemName));
        }

        System.out.println(coffeeM.insertMoney(10000));
        System.out.println(coffeeM.withdrawMoney(1000));
        coffeeM.sellItem(CoffeeType.CAFE_LATTE.name(), 5000);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("\n[INFO] 현재 잔액 :%d원\n", coffeeM.money);
            System.out.println("1.제품등록  2. 제품목록 3.제품삭제 4.입금  5.출금  6.판매  7.종료");
            System.out.print("메뉴를 입력하세요 >>> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("1.제품등록");
                    System.out.print("제품이름 입력 >> ");
                    String name = scanner.nextLine();
                    System.out.print("제품가격 입력 >> ");
                    int price = Integer.parseInt(scanner.nextLine());
                    coffeeM.insertItem(name, price);
                    break;
                case 2:
                    System.out.println("2.제품목록");
                    for (String itemName : coffeeM.itemlist.keySet()){
                        System.out.println(itemName + ":" + coffeeM.itemlist.get(itemName));
                    }
                    break;
                case 3:
                    System.out.println("3.제품삭제");
                    System.out.println("내용추가")
                    break;
                case 4:
                    System.out.println("4.입금");
                    break;
                case 5:
                    System.out.println("5.출금");
                    break;
                case 6:
                    System.out.println("6.판매");
                    break;
                case 7:
                    System.out.println("프로그램 종료중 .....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
                    break;
            }
        }
    }
}