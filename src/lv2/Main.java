package kiosk.l2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kiosk.l2.MenuItem;

public class Main {
    public static void main(String[] args) {
        // 메뉴 담을 리스트
        List<MenuItem> menuItems = new ArrayList<>();
        // 메뉴에 리스트 추가
        menuItems.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);
        int number;

        // 0이 입력될 때까지 반복
        do{
            System.out.println("[ SHAKESHACK MENU]");
            for(int i = 0; i < menuItems.size(); i++){
                MenuItem item = menuItems.get(i);
                // 메뉴 번호(%d), 메뉴 이름(%s), 메뉴 가격(%d), 메뉴 설명(%s)
                System.out.printf("%d. %s | W%d | %s\n", i+1, item.getName(), item.getPrice(), item.getExplain());
            }
            System.out.println("0. 종료          | 종료");

            // 번호 받기
            System.out.println("메뉴 번호 입력 : ");
            number = sc.nextInt();

            if (number == 0){
                System.out.println("프로그램을 종료합니다.");
            }else{
                System.out.println("\n선택한 메뉴:");
                MenuItem pick = menuItems.get(number-1);
                System.out.printf("%s | W %d | %s\n", pick.getName(), pick.getPrice(),pick.getExplain());
            }
        } while (number != 0);
    }
}