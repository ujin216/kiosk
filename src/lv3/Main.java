package kiosk.l3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // 리스트 생성
        List<MenuItem> menu = new ArrayList<>();
        // 리스트에 추가
        menu.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}
