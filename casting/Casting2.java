package casting;

public class Casting2 {
    static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생

        intValue = (int) doubleValue;
        System.out.println(intValue); // 형변환을 한다고 해서 기존값이 바뀌는 건 아님
    }
}
