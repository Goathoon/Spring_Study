package Goat.core.order;

import Goat.core.discount.DiscountPolicy;
import Goat.core.discount.FixDiscountPolicy;
import Goat.core.member.Member;
import Goat.core.member.MemberRepository;
import Goat.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member resultMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(resultMember,itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
