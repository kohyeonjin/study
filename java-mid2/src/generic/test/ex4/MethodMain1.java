package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {

        Integer i = 10;
        Object result = GenericMethod.objMethod(i);

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 전달");
        Integer result2 = GenericMethod.<Integer>genericMethod(i);
        Integer result3 = GenericMethod.<Integer>numberMethod(10);
        Double result4 = GenericMethod.<Double>numberMethod(3.14);
        
        //제네릭 메서드 타입 추론
        Integer result5 = GenericMethod.genericMethod(i);
        Integer result6 = GenericMethod.numberMethod(10);
        Double result7 = GenericMethod.numberMethod(3.14);

    }
}
