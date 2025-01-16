package nested.methodlocal;

public class EmployeeProcessor {

    // JSON 데이터를 처리하는 메서드
    public void processEmployeeData(String jsonData) {
        // 중첩 클래스 정의
        // 내부에서만 접근해서 사용할 거라 접근 제어자가 의미없다.
        class Employee {
            private String name;
            private String dept;

            public Employee(String name, String dept) {
                this.name = name;
                this.dept = dept;
            }

            @Override
            public String toString() {
                return "name: " + name + ", dept: " + dept;
            }
        }

    }
}
