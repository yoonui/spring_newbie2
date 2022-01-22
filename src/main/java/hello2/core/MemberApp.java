package hello2.core;

import hello2.core.member.Grade;
import hello2.core.member.Member;
import hello2.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        // AppConfig appConfig = new AppConfig();
        // MemberService memberService = new MemberServiceImpl();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // 스프링 컨테이너
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        // MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "코딩맘", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member: " + member.getName());
        System.out.println("findMember: " + findMember.getName());
    }
}
