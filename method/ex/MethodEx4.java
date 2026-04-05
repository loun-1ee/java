package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.println("선택: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.print("입금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    balance = deposit(balance, deposit);
                }
                case 2 -> {
                    System.out.print("출금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    balance = withdraw(balance, withdraw);
                }
                case 3 -> System.out.println("현재 잔액: " + balance + "원");
                case 4 -> {
                    System.out.println("시스템을 종료합니다.");
                    return;
                }
                default -> System.out.println("올바른 번호를 입력하세요 (1~4).");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}