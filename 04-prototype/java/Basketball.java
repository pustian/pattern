public class Basketball implements Sport {
    private String aplayer = "King";

    public Basketball(String player) {
        aplayer = player;
    }

    @Override
    public String howToPlay() {
        String msg = "Play a ball by your hands";
        System.out.println(msg);
        return msg;
    }
    
    @Override
    public String getBestPlayer() {
        return aplayer; 
    }
    
    @Override
    public void showMessage() {
        System.out.println("The Best Club is HuRen");
    }

    @Override
    public Sport cloneSport() {
        Sport sport = null; 
        try { 
            sport = (Sport) clone(); 
            // deepclone
            // other resource need to be clone
            // XXXXXX a = ((Basketball)sport).getXXXXXX();
            // ((Basketball)sport).setXXXXXX((XXXXXX) a.clone());
        } 
        catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        return sport;
    }
}
