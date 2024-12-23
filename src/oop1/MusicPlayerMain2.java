package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 전 코드랑 다른 점은 기존은 지역변수로 선언했는데 이 메소드에서는 MusicPlayer 관련된 데이터를 한 번에 묶어두고 싶어서 따로 클래스 생성함
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        // 음악 플레이어 켜기
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 증가: " + musicPlayerData.volume);

        // 볼륨 증가
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨 증가: " + musicPlayerData.volume);

        // 볼륨 감소
        musicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨 증가: " + musicPlayerData.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");

        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어 종료");

        // 이후에 프로그램 로직이 더 복잡해져서 다양한 변수들이 추가되더라도 음악 플레이어와 관련된 변수들은 
        // MusicPlayerData musicPlayerData 객체에 속해있으므로 쉽게 구분할 수 있음
    }
}
