package ch17.dto;

public class ControllerTest {

    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.initData();

        //전체조회
        System.out.println("=== 전체 조회 ===");
        userService.findAll().forEach(System.out::println);

        System.out.println("=== 활성사용자 조회 ===");
        userService.findActiveUsers().forEach(System.out::println);

        System.out.println("=== 화원 단건 조회 ===");
        System.out.println(userService.findOne(1L));


        System.out.println("=== 회원가입 ===");
        UserCreateRequest userCreateRequest = new UserCreateRequest(
                "박우진", "cyasoon10@naver.com", "123"
        );
        Long saveId = userService.save(userCreateRequest);
        System.out.println("저장된 id : " + saveId);

        //전체조회
        System.out.println("=== 전체 조회 ===");
        userService.findAll().forEach(System.out::println);

    }
}
