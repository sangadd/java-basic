package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        /*
        // 볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 증가: " + musicPlayerData.volume);

        // 볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 증가: " + musicPlayerData.volume);

        이 코드에서는 중복된 부분이 있다 그리고 각각의 기능들은 이후에 재사용 될 가능성이 높다.
        1. 음악 플레이어 켜기, 끄기
        2. 볼륨 증가, 감소
        3. 음악 플레이어 상태 출력

        그래서 메서드를 사용해서 각각의 기능을 구분해야함
        */

        MusicPlayerData musicPlayerData = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(musicPlayerData);

        // 볼륨 증가
        volumeUp(musicPlayerData);

        // 볼륨 증가
        volumeUp(musicPlayerData);

        // 볼륨 감소
        volumeDown(musicPlayerData);

        // 음악 플레이어 상태
        showStatus(musicPlayerData);

        // 음악 플레이어 끄기
        off(musicPlayerData);

    }

    static void on(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData musicPlayerData){
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 증가: " + musicPlayerData.volume);
    }

    static void volumeDown(MusicPlayerData musicPlayerData){
        musicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨 감소: " + musicPlayerData.volume);
    }

    static void showStatus(MusicPlayerData musicPlayerData){
        System.out.println("음악 플레이어 상태 확인");

        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    // 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화되었다.
    // 장점
    // 1. 중복 제거 : 로직 중복이 제거됨 같은 로직이 필요하면 해당 메서드를 여러번 호출 가능
    // 2. 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 됨
    // 3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해 가능

    /*
    * 모듈화?
    쉽게 이야기해서 레고 블럭을 생각하면 됨
    필요한 블럭을 가져다 꼽아서 사용 가능
    여기서는 음악 플레이어의 기능이 필요하면 해당 기능을 메서드 호출 만으로 손쉽게 사용 가능
    이제 음악 플레이어와 관련된 메서드를 조립해서 프로그램을 작성 가능!
    */

    /*
    절차 지향 프로그램의 한계
    지금까지 클래스를 사용해서 관련된 데이터를 하나로 묶고 또 메서드를 사용해서 각각의 기능을 모듈화했다.
    덕분에 상당히 깔끔하고 읽기 좋고 유지보수 하기 좋은 코드를 작성할 수 있었다.

    하지만 여기서 더 개선할 수는 없을까???

    우리가 작성한 코드의 한계는 바로 데이터와 기능이 분리되어 있다는 점이다.
    음악 플레이어의 데이터는 MusicPlayerData에 있고 그 데이터를 사용하는 기능은 MusicPlayerMain3에 있는 각각의 메서드에 분리되어 있다.
    그래서 음악 플레이어와 관련된 데이터(속성)은 MusicPlayerData를 사용해야 하고
    음악 플레이어와 관련된 기능은 MusicPlayerMain3의 각 메서드를 사용해야 한다.

    데이터와 그 데이터를 사용하는 기능은 매우 밀접하게 연관되어 있다.
    각각의 메서드를 보면 대부분 MusicPlayerData의 데이터를 사용한다. 따라서 이후에 관련 데이터가 변경되면 MusicPlayerMain3 부분의 메서드들도 함께 변경해야함
    그리고 이렇게 데이터와 기능이 분리되어 있으면 유지보수 관점에서도 관리 포인트가 2곳으로 늘어남🥹 !!!

    객체 지향 프로그래밍이 나오기 전까지는 지금과 같이 데이터와 기능이 분리되어 있었다
    따라서 지금과 같은 코드가 최선이었다 하지만 객체 지향 프로그래밍이 나오면서 데이터와 기능은 온전히 하나1️⃣로 묶어서 사용할 수 있게 되었다
    */
}
