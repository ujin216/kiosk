package kiosk.l3;

public class MenuItem {
    String name;
    int price;
    String explain;

    public MenuItem(String name, int price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getExplain(){
        return explain;
    }

    // 문자열로 표현할때의 형식
    @Override
    public String toString() {
        return name + " | W " + price + " | " + explain;}
}
