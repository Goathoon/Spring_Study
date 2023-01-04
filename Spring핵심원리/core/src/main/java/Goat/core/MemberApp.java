package Goat.core;

import Goat.core.member.Grade;
import Goat.core.member.Member;
import Goat.core.member.MemberService;
import Goat.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"GOAT", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " +findMember.getName());
        System.out.println("member = " + member.getName());
    }
}
