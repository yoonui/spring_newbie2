package hello2.core;

import hello2.core.member.Grade;
import hello2.core.member.Member;
import hello2.core.member.MemberService;
import hello2.core.order.Order;
import hello2.core.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId =1L;
        Member member = new Member(memberId, "김감자", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "아이템이당", 10000);
        System.out.println("order = " + order.toString());
        System.out.println("order = " + order.calculatePrice());
    }
}
