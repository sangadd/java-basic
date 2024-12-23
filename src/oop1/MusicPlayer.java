package oop1;

public class MusicPlayer {
        /*
        지금까지 개발한 음악 플레이어는 데이터와 기능이 따로 분리되어 있음!
        이제 데이터와 기능을 하나로 묶어서 음악 플레이어라는 개념을 온전히 하나의 클래스에 담아야함
        프로그램을 작성하는 절차도 중요하지만 지금음 음악 플레이어라는 개념을 객체로 온전히 만드는 것이 더 중요함

        프로그램 실행 순서보다는 음악 플레이어 클래스를 만드는 것 자체에 집중해야함
        음악 플레이어가 어떤 속성(데이터)을 가지고 어떤 기능(메서드)을 제공하는지 이 부분에 초점을 맞추어야 한다.

        음악 플레이어를 만들어서 제공하는 개발자와 음악 플레이어를 사용하는 개발자가 분리되어 있다고 생각하자

        <음악 플레이어>
        속성 : volume, isOn
        기능 : on(), off(), volumeUp(), volumeDown(), showStatus()
        */

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨 증가: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨 감소: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");

        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    /*
    * 이 클래스에 음악 플레이어에 필요한 속성과 기능 모두 정의함
    * 이제 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용 가능
    *
    * 음악 플레이어를 사용하는데 필요한 모든 속성과 기능이 하나의 클래스에 포함되어 있음
    * 
    * => MusicPlayerMain4() 클래스에서 사용함
    */

}
