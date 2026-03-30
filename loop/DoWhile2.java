package loop;

public class DoWhile2 {
    static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);
    }
}

// 최초 한번은 항상 실행된다.