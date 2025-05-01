package kiosk.l3;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 메뉴 저장 리스트
    private List<MenuItem> menuItems;
    private Scanner scanner = new Scanner(System.in);

    // menuItems 리스트 받아와서 저장
    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    public void start(){
        // 0 누르기 전까지 반복
        while(true){
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i));
            }
            System.out.println("0. 종료 | 종료");
            int number = scanner.nextInt();
            if (number == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(number>0&&number<=menuItems.size()){
                MenuItem selected = menuItems.get(number - 1);
                System.out.println("선택한 메뉴: " + selected);
            }
            else{
                System.out.println("잘못된 번호입니다.");
            }
        }
    }
}
