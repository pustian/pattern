public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    @Override
    public void play(String audioType, String filename) {
        advanceMediaPlayer = getMediaPlayer(audioType);

        if(audioType.equals("vlc")) {
            advanceMediaPlayer.playVlc(filename);
        } else if(audioType.equals("mp4")) {
            advanceMediaPlayer.playMp4(filename);
        } else {
            System.out.println("unkone audioType");
        }
    }

    private AdvanceMediaPlayer getMediaPlayer(String audioType) {
        if(audioType.equals("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if(audioType.equals("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        } else {
            advanceMediaPlayer = null;
        }
        return advanceMediaPlayer;
    }
}
