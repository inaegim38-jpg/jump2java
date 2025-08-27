import java.util.ArrayList;

public class MoneyCheck {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("2000"); // 1. 세미콜론(;) 누락
        pocket.add("card"); // 2. 세미콜론(;) 누락

        if (pocket.contains("card")) { // 3. if 문 뒤의 불필요한 세미콜론 제거 및 중괄호 추가
            System.out.println("택시");
        } else if (pocket.contains("2000")) { // 4. pocket.get(0)은 예외를 발생시킬 수 있으므로 contains로 변경 및 중괄호 추가
            System.out.println("버스"); // 5. '2000'이 있을 경우의 행동 추가
        } else { // 6. else 문의 중괄호 위치 수정
            System.out.println("걸어간다"); // 7. 세미콜론(;) 누락
        }
    }
}