import java.util.HashMap;
import java.util.Map;

public class CoffeeM {
    // 커피자판기
    // 속성-제품이름, 제품가격, 잔액
    Map<String,Integer> itemlist = new HashMap<>();
    int money = 0;

    // 기능-판매,제품 등록,잔액입금,출금
    // 제품등록   리턴: void    이름: insertItem      입력값: 제품이름, 제품가격
    public void insertItem(String name, int price){
        itemlist.put(name,price);
    }
    // 제품수정 리턴:void  이름: deleteItem  입력값: 제품이름, 제품가격
    public void deleteItem(String name){
        itemlist.remove(name);
    }

    // 잔액넣기
    public int insertMoney(int money){
        return this.money += money;
    }

    // 잔액출금
    public int withdrawMoney(int money){
        if(this.money >= money){
            this.money -= money;
            return this.money;
        } else {
            money = this.money;
            this.money = 0;
            return this.money;
        }
    }

    // 판매
    public void sellItem(String name,int inputMoney){
        if(itemlist.containsKey(name)){
            int price = itemlist.get(name);
            if(inputMoney < price){
                System.out.println("금액이 부족합니다.");
            } else {
                this.money += inputMoney;
                this.money -= inputMoney-price;
                System.out.println("잔액은 "+ (inputMoney-price) + "원 입니다.");
            }
        }
    }
}
