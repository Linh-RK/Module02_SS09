package ex03.rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Playable videoPlayer = new VideoPlayer();
        Playable audioPlayer = new AudioPlayer();
        videoPlayer.play();
        audioPlayer.play();
    }
}
