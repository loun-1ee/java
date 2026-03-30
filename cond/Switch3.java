package cond;

public class Switch3 {
    static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // 2등급도 3등급과 같이 3000원 쿠폰을 준다고 가정: break문 삭제
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰: " + coupon);
    }
}
