package Goat.core;

import Goat.core.discount.FixDiscountPolicy;
import Goat.core.member.MemberService;
import Goat.core.member.MemberServiceImpl;
import Goat.core.member.MemoryMemberRepository;
import Goat.core.order.OrderService;
import Goat.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
