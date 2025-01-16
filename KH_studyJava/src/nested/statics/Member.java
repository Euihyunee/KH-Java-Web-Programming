package nested.statics;

public class Member {
    private String id;
    private String pw;
    private String name;

    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
    public static MemberBuilder builder(){
        return new MemberBuilder();
    }
    // static 중첩 클래스
    static class MemberBuilder {
        private String id;
        private String pw;
        private String name;

        public MemberBuilder id(String id) {
            this.id = id;
            return this;
        }
        public MemberBuilder name(String name) {
            this.name = name;
            return this;
        }
        public MemberBuilder pw(String pw) {
            this.pw = pw;
            return this;
        }
        public Member build(){
            return new Member(id, pw, name);
        }
    }
}
