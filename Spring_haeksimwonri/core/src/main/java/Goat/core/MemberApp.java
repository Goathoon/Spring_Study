package Goat.core;

import Goat.core.member.Grade;
import Goat.core.member.Member;
import Goat.core.member.MemberService;
import Goat.core.member.MemberServiceImpl;
import Goat.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); //스프링 컨테이너 ApplicationContext
        MemberService memberService = applicationContext.getBean("m emberService", MemberService.class);//메소드 이름을 이름 등록(첫번째 인자) 두번째인자는 반환 타입

        Member member = new Member(1L,"GOAT", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " +findMember.getName());
        System.out.println("member = " + member.getName());
    }
}
