package hello2.core;

import hello2.core.discount.DiscountPolicy;
import hello2.core.discount.RateDiscountPolicy;
import hello2.core.member.MemberRepository;
import hello2.core.member.MemberService;
import hello2.core.member.MemberServiceImpl;
import hello2.core.member.MemoryMemberRepository;
import hello2.core.order.OrderService;
import hello2.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() { // MemberRepository 역할
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() { // DiscountPolicy 역할
        return new RateDiscountPolicy();
    }

    @Bean
    public MemberService memberService(){ // MemberService 역할
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){ // OrderService 역할
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

}
