package controler;


import repository.Repository;

//import java.util.ArrayList;
import java.util.Scanner;

//입력받은거 실행하는 컨트롤러
public class Controller {
    Scanner sc = new Scanner(System.in);
    static Repository rp = new Repository();

    public void selectMode(){
        while (true) {
            System.out.println("1.사람 입력 2. 랜덤추출 3.불참제거 4.경품 랜덤 지급");
            String mode = sc.nextLine();
            switch (mode) {
                case ("1"):
                    // todo
                    // 사람 50명 랜덤 입력(db에 넣어야함)
                    insert();
                    break;
                case ("2"):
                    // todo
                    // 랜덤으로 10명 추출(db에서 삭제)
                    break;
                case ("3"):
                    // todo
                    // 불참인원 3마리 거(랜덤이든, 입력이든 제거)
                    break;
                case("4"):
                    //todo
                    //경품 5명 랜덤 지급
                    break;
            }
        }
    }
    public static void insert(){


//        ArrayList<String> peopleName = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
//            65 ~ 90 알파벳 아스키코드
            int name1 = ( (int) (Math.random() * (90-65+1)) + 65 );
            int name2 = ( (int) (Math.random() * (90-65+1)) + 65 );
            int name3 = ( (int) (Math.random() * (90-65+1)) + 65 );
            int name4 = ( (int) (Math.random() * (90-65+1)) + 65 );
            String FullName = ""+((char) name1)+ ((char) name2) + ((char) name3) + ((char) name4);
//            peopleName.add(FullName);

            rp.insertUsers(FullName);

        }
        System.out.println("입력이 완료되었습니다.");
    }

}
