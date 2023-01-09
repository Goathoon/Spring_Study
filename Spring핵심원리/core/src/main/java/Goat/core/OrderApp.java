package Goat.core;

import Goat.core.member.Grade;
import Goat.core.member.Member;
import Goat.core.member.MemberService;
import Goat.core.member.MemberServiceImpl;
import Goat.core.order.Order;
import Goat.core.order.OrderService;
import Goat.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId,"Goat", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);
        System.out.println("order = "+order);

    }
}
