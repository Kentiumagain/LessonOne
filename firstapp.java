public class firstapp {

    static double F1 (int a, int b, int c, int d){
        double F1 = a * (b + (c / d));
        return F1;
    }
    static boolean F2 (int a, int b){
        boolean F2;
        int sum = a+b;
        F2= (sum >= 10) && (sum <= 20);
        return F2;
    }
    static void F3 (int a){
        if (a>=0)
            System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }
    static boolean F4(int a){
        boolean F4= a<0;
        return F4;
    }
    static void F5(String s){
        System.out.println("Привет, "+s+"!");
    }
    static boolean F6(int year){
        boolean F6= (year%4==0)&&((year%100!=0)||(year%400==0));
        return F6;
    }
    public static void main(String[] args) {

        byte a = 27;
        short b = 129;
        int c = 3112;
        long d = 444210;
        char e = 's';
        double v = 14.2;
        float s = 1.2f;
        String qwe = "qwe";

    }
}
