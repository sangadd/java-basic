package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();

        // 볼륨 증가
        musicPlayer.volumeUp();

        // 볼륨 증가
        musicPlayer.volumeUp();

        // 볼륨 감소
        musicPlayer.volumeDown();

        // 음악 플레이어 상태
        musicPlayer.showStatus();

        // 음악 플레이어 끄기
        musicPlayer.off();

        /*
        MusicPlayer 객체를 생성하고 필요한 기능(메서드)을 호출하기만 하면 된다,
        필요한 모든 것은 MusicPlayer 안에 들어있어서!!

        1. MusicPlayer를 사용하는 입장에서는 MusicPlayer의 데이터인 volume, isOn 같은 데이터는 전혀 사용하지 않음 
        2. MusicPlayer를 사용하는 입장에서는 이제 MusicPlayer 내부에 어떤 속성(데이터)이 있는지 전혀 몰라도 됨 
        3. MusicPlayer를 사용하는 입장에서는 단순하게 MusicPlayer가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면 됨

        >> 캡슐화 <<
        MusicPlayer를 보면 음악 플레이어르 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
        이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.

        장점
        MusicPlayer 내부 코드가 변경되는 경우에 다른 코드는 변경하지 않아도 됨
        MusicPlayer의 volume 이라는 필드 이름이 다른 이름으로 변한다고 할 때 MusicPlayer 내부만 변경하면 됨
        또 음악 플레이어가 내부에서 출력하는 메시지를 변경할 때도 MusicPlayer 내부만 변경하면 됨
        이 경우 MusicPlayer를 사용하는 개발자는 코드를 전혀 변경하지 않아도 됨
        */
    }
}
