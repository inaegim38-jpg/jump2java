package com.mycompany.businesscard;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessCardManager {

    public static void main(String[] args) {
        ArrayList<BusinessCard> cards = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1. 명함 추가");
            System.out.println("2. 명함 목록 보기");
            System.out.println("3. 명함 수정");
            System.out.println("4. 명함 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            String menu = scanner.nextLine();

            if (menu.equals("1")) {
                // 명함 추가 기능
                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();
                System.out.print("전화번호를 입력하세요: ");
                String phone = scanner.nextLine();
                System.out.print("회사를 입력하세요: ");
                String company = scanner.nextLine();

                BusinessCard newCard = new BusinessCard(name, phone, company);
                cards.add(newCard);
                System.out.println("명함이 추가되었습니다.");
            } else if (menu.equals("2")) {
                // 명함 목록 보기 기능
                System.out.println("\n--- 명함 목록 ---");
                if (cards.isEmpty()) {
                    System.out.println("등록된 명함이 없습니다.");
                } else {
                    for (int i = 0; i < cards.size(); i++) {
                        BusinessCard card = cards.get(i);
                        System.out.println("이름: " + card.name + ", 전화번호: " + card.phoneNumber + ", 회사: " + card.company);
                    }
                }
                System.out.println("-----------------");
            } else if (menu.equals("3")) {
                // 명함 수정 기능
                System.out.print("수정할 명함의 이름을 입력하세요: ");
                String nameToUpdate = scanner.nextLine();
                BusinessCard cardToUpdate = findCard(cards, nameToUpdate);

                if (cardToUpdate != null) {
                    System.out.print("새 전화번호를 입력하세요: ");
                    cardToUpdate.phoneNumber = scanner.nextLine();
                    System.out.print("새 회사를 입력하세요: ");
                    cardToUpdate.company = scanner.nextLine();
                    System.out.println("명함이 수정되었습니다.");
                } else {
                    System.out.println("해당 이름의 명함이 없습니다.");
                }
            } else if (menu.equals("4")) {
                // 명함 삭제 기능
                System.out.print("삭제할 명함의 이름을 입력하세요: ");
                String nameToDelete = scanner.nextLine();
                BusinessCard cardToDelete = findCard(cards, nameToDelete);

                if (cardToDelete != null) {
                    cards.remove(cardToDelete);
                    System.out.println("명함이 삭제되었습니다.");
                } else {
                    System.out.println("해당 이름의 명함이 없습니다.");
                }
            } else if (menu.equals("5")) {
                // 프로그램 종료 기능
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다. 다시 선택하세요.");
            }
        }
        scanner.close();
    }

    // 명함을 찾는 findCard 함수
    public static BusinessCard findCard(ArrayList<BusinessCard> cards, String name) {
        for (BusinessCard card : cards) {
            if (card.name.equals(name)) {
                return card;
            }
        }
        return null;
    }
}