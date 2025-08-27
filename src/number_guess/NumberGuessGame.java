import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다!");

        do {
            System.out.println("\n--- 난이도를 선택하세요 ---");
            System.out.println("1. 쉬움 (1 ~ 50)");
            System.out.println("2. 보통 (1 ~ 100)");
            System.out.println("3. 어려움 (1 ~ 200)");
            System.out.print("선택: ");
            int level = scanner.nextInt();

            int maxNumber;
            if (level == 1) {
                maxNumber = 50;
            } else if (level == 2) {
                maxNumber = 100;
            } else {
                maxNumber = 200;
            }

            int randomNumber = random.nextInt(maxNumber) + 1;
            int userGuess = 0;
            int guessCount = 0;

            System.out.println("\n나는 1부터 " + maxNumber + "까지의 숫자 중 하나를 생각했어요. 맞춰보세요.");

            while (userGuess != randomNumber) {
                System.out.print("숫자를 입력하세요: ");
                userGuess = scanner.nextInt();
                guessCount++;

                if (userGuess < randomNumber) {
                    System.out.println("너무 작아요! 더 큰 숫자를 입력하세요.");
                } else if (userGuess > randomNumber) {
                    System.out.println("너무 커요! 더 작은 숫자를 입력하세요.");
                } else {
                    System.out.println("정답입니다! " + guessCount + "번 만에 맞히셨네요.");
                }
            }

            System.out.print("다시 하시겠습니까? (y/n): ");
            scanner.nextLine(); // 버퍼 비우기
            playAgain = scanner.nextLine();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}