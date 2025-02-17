package poly.ex.pay1;

// 결제 수단 찾아주는 메서드
public abstract class PayStore {

    // 변하는 부분
      public static Pay findPay(String option) {

//        // 1. Pay 선언 (부모 타입)
//        Pay pay;

        if (option.equals("kakao")) {
//            pay = new KakaoPay(); // 2) KakaoPay kakaoPay 을 pay로 변경 (부모 타입안에 자식 타입)
            // 위에 코드를 아래로 수정
            return new KakaoPay();
        } else if (option.equals("naver")) {
//            pay = new NaverPay();
            // 위에 코드를 아래로 수정
            return new NaverPay();
        } else if (option.equals("new")) {
//            pay = new NaverPay();
            // 위에 코드를 아래로 수정
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
