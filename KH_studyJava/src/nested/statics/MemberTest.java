package nested.statics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Member.MemberBuilder inner = new Member.MemberBuilder();

        /*
        Member 객체 생성
        Member.MemberBuilder inner2 = new Member.MemberBuilder();

        Member.MemberBuilder inner = Member.builder();
        Member member = inner.build();
        Member member = Member.builder().build();

        Member.MemberBuilder inner = Member.builder();
        inner = inner.id("coding");
        inner = inner.pw("1234");
        inner = inner.name("코딩그라운드");
        Member member = inner.build();
         */
        Member member = Member.builder() // Member.MemberBuilder
                .id("coding")
                .pw("1234")
                .name("코딩 그라운드")
                .build();
        // System.out.println(member);

        List<Object> str = new ArrayList<>();
        List<Iterator> itr = new ArrayList<>();
        itr.add(str.iterator());
        str.add(itr);

    }
}
