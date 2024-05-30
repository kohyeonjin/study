package generic.ex5;

public class EraserBox <T>{

    public boolean instanceCheck(Object param){

        //런타임에 모두 Object로 바뀜
        //return param instanceof T; // 컴파일 오류 항상 참

        return false;
    }

    public void create() {
        //return new T(); // 컴파일 오류 new Object(); 개발자 의도와 다름
    }
}
