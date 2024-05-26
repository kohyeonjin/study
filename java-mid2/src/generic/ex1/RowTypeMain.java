package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // <>지정하지 않을경우 타입 매개변수 Object
        GenericBox integetBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integetBox.set(10);
        Integer result  = (Integer)integetBox.get();
        System.out.println("result = " + result);
    }
}
