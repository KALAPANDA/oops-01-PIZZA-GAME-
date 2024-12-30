import java.util.*;

class pizza {
    private int price;
    private boolean veg;
    private boolean isextracheese = false;
    private boolean isextratoppings = false;
    private boolean isextratake = false;

    public pizza(boolean veg) {
        this.veg = veg;
        this.price = veg ? 300 : 400;
    }

    private int cheese = 150;
    private int toppings = 200;
    private int takeayad = 20;

    public void addextracgheese() {
        this.isextracheese = true;
        System.out.println("Cheese added cost 150\n");
        this.price += cheese;
    }

    public void addextractoopings() {
        this.isextratoppings = true;
        System.out.println("Toppings added cost 200\n");

        this.price += toppings;
    }

    public void takeaway() {
        this.isextratake = true;
        System.out.println("Take away opted cost 20");

        this.price += takeayad;
    }

    public void getbill() {
        System.out.println("----- Bill -----");
        System.out.println(veg ? "Veg Pizza: 300" : "Non-Veg Pizza: 400");
        if (isextracheese) {
            System.out.println("Cheese added price " + cheese);
        }
        if (isextratoppings) {
            System.out.println("Toppings added price " + toppings);
        }
        if (isextratake) {
            System.out.println("Take away added price " + takeayad);
        }

        System.out.println("Total price is " + this.price);

        // System.out.println();
        System.out.println();
    }

}

class delux extends pizza {
    public delux(boolean veg) {
        super(veg);
        super.addextracgheese();
        super.addextractoopings();
    }

    @Override
    public void addextracgheese() {
    }

    public void addextractoopings() {
    }

}

public class pzza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n1.regular pizza\n2.delux pizza");
        int s = sc.nextInt();
        switch (s) {
            case 1:
                System.out.println("1.Veg\n2.Non veg");
                int z = sc.nextInt();
                boolean a = false;
                if (z == 1) {
                    a = true;
                } else {
                    a = false;
                }

                pizza p1 = new pizza(a);
                while (true) {
                    System.out.println("Choose\n1.Extra cheese\n2.Extra toppings\n3.Take away\n4.Bill\n5.Exit");
                    int b = sc.nextInt();
                    System.out.println();
                    switch (b) {
                        case 1:
                            p1.addextracgheese();
                            break;
                        case 2:
                            p1.addextractoopings();
                            break;
                        case 3:
                            p1.takeaway();
                            break;
                        case 4:
                            p1.getbill();
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("enter valid number\n");

                    }
                    if (b == 5) {
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("1.Veg\n2.Non veg");
                int r = sc.nextInt();
                boolean p;
                if (r == 1) {
                    p = true;
                } else {
                    p = false;
                }
                delux d = new delux(p);
                while (true) {
                    System.out.println("Choose\n1.Take away\n2.Bill\n3.Exit");
                    int q = sc.nextInt();
                    System.out.println();
                    switch (q) {
                        case 1:
                            d.takeaway();
                            break;
                        case 2:
                            d.getbill();
                            break;
                        case 3:
                            System.out.println("Exiting...\n");

                            break;
                        default:
                            System.out.println("enter valid number\n");

                    }
                    if (q == 3) {
                        break;
                    }
                }

            default:
                break;
        }

    }
}
