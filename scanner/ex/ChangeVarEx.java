package scanner.ex;

public class ChangeVarEx {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/*
a와 b를 한번에 교환할 수는 없다.
임시 변수 필요!!
 */