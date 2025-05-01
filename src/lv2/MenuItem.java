package kiosk.l2;

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
}
