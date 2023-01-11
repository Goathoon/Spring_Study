package Goat.core;

import Goat.core.discount.DiscountPolicy;
import Goat.core.discount.RateDiscountPolicy;
import Goat.core.member.MemberRepository;
import Goat.core.member.MemberService;
import Goat.core.member.MemberServiceImpl;
import Goat.core.member.MemoryMemberRepository;
import Goat.core.order.OrderService;
import Goat.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    private static MemberRepository memberRepository() { //굳이 public으로
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    private static DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
