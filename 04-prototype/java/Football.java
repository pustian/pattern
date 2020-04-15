public class Football implements Sport {
    private String aplayer = "Lionel Messi";

    public Football(String player) {
        aplayer = player;
    }

    @Override
    public String howToPlay() {
        String msg = "Play a ball by your foot";
        System.out.println(msg);
        return msg;
    }
    
    @Override
    public String getBestPlayer() {
        return aplayer; 
    }
    
    @Override
    public void showMessage() {
        System.out.println("The Best Club is Real Madrid Club de Fútbol");
    }

    @Override
    public Sport cloneSport() {
        Sport sport = null; 
        try { 
            sport = (Sport) clone(); 
            // deepclone
            // other resource need to be clone
            // XXXXXX a = ((Football)sport).getXXXXXX();
            // ((Football)sport).setXXXXXX((XXXXXX) a.clone());
        } 
        catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        return sport;
    }
}
