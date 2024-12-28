package access;

import javax.swing.*;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeDown();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();

        // 필드에 직접 접근
        System.out.println("======== volume 필드 직접 접근해서 수정 ========");
//        speaker.volume = 200;
        speaker.showVolume();

        // 이렇게 필드에 직접 접근하니까 음량이 100을 넘지 못하도록 기능을 개발했지만 소용없다
        // 그래서 이 문제를 해결하기 위해 volume 필드의 외부 접근을 막을 수 있는 방법이 필요함!!
        // 방법 ===> int volume; -> private int volume; 로 수정
    }
}
