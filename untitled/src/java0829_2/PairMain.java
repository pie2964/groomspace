package java0829_2;

public class PairMain {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String,Integer>();
        pair.setT("JBC");
        pair.setB(100);

        System.out.println("pair : "+pair.getT()+" "+pair.getB());


    }
}
