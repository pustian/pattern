public class Clienter {
    public static void main(String[] args){
        HouseTemplate houseOne = new HouseOne("房子1", false);
        HouseTemplate houseTwo = new HouseTwo("房子2");
        houseOne.buildHouse();
        houseTwo.buildHouse();
    }

}
