package hello2.core.autowired;

import hello2.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        @Autowired(required = false)
        public void setNoBean1(Member noBean){
            System.out.println("noBean1 = " + noBean);
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean){
            System.out.println("noBean2 = " + noBean);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean){
            System.out.println("noBean3 = " + noBean);
        }
    }
}
