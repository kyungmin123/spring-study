package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// controller는 spring에서 직접 관리하기 때문에 configuration 등록 불가
@Controller
public class MemberController {
    private MemberService memberService;

//    setter Injection: service를 바꿀 필요가 없는데 public으로 바꿀 수가 있음, 조립할 때에만 바꾸면 됨
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
    // 필드 주입
//    @Autowired private MemberService memberService;

//    생성자 주입: (권장) 의존 관계가 실행 중에 동적으로 변하는 경우가 거의 없음
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
