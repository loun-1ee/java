package scope;

public class Scope3_1 {
    static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
 /* 좋은 코드라고 보기 어려움.
 1. 비효율적인 메모리 사용
    temp 는 if 코드 블록에서만 사용
 2. 코드 복잡성 증가
 */
