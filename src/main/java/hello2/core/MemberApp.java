package hello2.core;

import hello2.core.member.Grade;
import hello2.core.member.Member;
import hello2.core.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        // MemberService memberService = new MemberServiceImpl();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "코딩맘", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member: " + member.getName());
        System.out.println("findMember: " + findMember.getName());
    }
}
