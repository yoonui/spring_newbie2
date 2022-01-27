package hello2.core.singleton;

public class SingletonService {

    // 자기 자신을 내부의 private으로 하나 가지고 있는다
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){} // private 생성자로 생성을 막아버린다

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
