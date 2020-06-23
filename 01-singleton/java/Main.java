public class Main {
    public static void main(String[] args) {
       // SingleTon01 singles[] = new SingleTon01[4];
       // SingleTon02 singles[] = new SingleTon02[4];
       // SingleTon03 singles[] = new SingleTon03[4];
       // SingleTon04 singles[] = new SingleTon04[4];
       // SingleTon05 singles[] = new SingleTon05[4];
       SingleTon06 singles[] = new SingleTon06[4];
       for(int i=0; i< 4; ++i) {
           // singles[i] = SingleTon05.getInstance();
           singles[i] = SingleTon06.INSTANCE;
       } 
    }
}
