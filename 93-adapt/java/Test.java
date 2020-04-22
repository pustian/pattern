public class Test {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter();

        mediaPlayer.play("vlc", "movie.vlc");
        mediaPlayer.play("mp4", "vedio.mp4");
        mediaPlayer.play("mp3", "vedio.mp3");
    }
}
