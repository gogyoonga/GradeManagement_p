import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String PRO_CODE = "1234";

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("반갑습니다. 권한을 선택해주세요.");
            System.out.println("1.학생 2. 교수 / 그 외. 종료 \n >> ");
            int select = sc.nextInt();

            switch (select){
                case 1:
                    System.out.println("인증 코드 입력 >> ");
                    String codeNumberS = sc.next();

                    Student student = new Student();
                    student.setStuNo(codeNumberS);
                    System.out.println("1. 내 성적 보기 2. 내 정보 보기 / 그 외. 종료 \n >> ");

                    System.out.println("---내 성적 보기---");
                    student.getScore();
                    System.out.println("---내 정보 보기---");
                    System.out.println("학 번 : "+student.getStuNo());
                    System.out.println("이 름 : "+student.getName());
                    System.out.println("학 년 : "+student.getYear());
                    System.out.println("수강 과목 : ");
                    student.getSubject();

                    break;
                case 2:
                    System.out.println("인증 코드 입력 >> ");
                    String codeNumberP = sc.next();
                    if(codeNumberP != PRO_CODE) System.out.println("인증 실패!");

                    break;
                default:

                    break;

            }

        }

    }
}