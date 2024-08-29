package day0829;

public class GboxMain {
    public static void main(String[] args) {
        Gbox<String> box1 = new Gbox<String>(); // editor에 따라 <> string 하나만 넣어야 오류 해결 가능
        box1.setT("hello");

        String str = box1.getT(); // 강제 타입 변환 없음
        System.out.println(str);

        Gbox<Integer> box2 = new Gbox<Integer>();
        box2.setT(10);

        int value = box2.getT();
        System.out.println(value);

    }
}
