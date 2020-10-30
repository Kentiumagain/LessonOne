import java.util.Random;

public class Lesson2 {
// Метод для вычисления суммы в массиве a, с элемента a1 до a2
    static int summ(int a[],int a1,int a2){
        int summ = 0;
        for (int i = a1; i <= a2; i++) summ += a[i];
        return summ;
    }
// Метод для определения есть ли место в массиве, где его правая и левая половины равны по сумме
    static boolean F1(int[] a){
        boolean F1=false;
        int sum1,sum2;
        for (int i = 0; i < a.length-1; i++) {
            sum1=summ(a,0,i);
            sum2=summ(a,i+1,a.length-1);
            if (sum1==sum2) {
                F1=true;
                break;
            }
        }
        return F1;
    }
// Метод для смещения всех элементов массива a на n позиций
    static void F2(int[] a, int n){
        int temp,temp1;
// При положительном смещении
        if (n>0) {
            for (int i = 0; i < n; i++) {
                temp = a[0];
                for (int j = 1; j < a.length; j++) {
                    temp1 = a[j];
                    a[j] = temp;
                    temp = temp1;
                }
                a[0] = temp;
            }
        }
// При отрицательном смещении
        else if (n<0) {
            for (int i = 0; i > n ; i--) {
                temp=a[a.length-1];
                for (int j = a.length-2; j >=0 ; j--) {
                    temp1=a[j];
                    a[j]=temp;
                    temp=temp1;
                }
                a[a.length-1]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Random r=new Random();
// 1 Пункт
        int[] m = {1,1,0,0,1,0,1,1,0,0};
        for (int i: m)
            if (m[i] == 0) m[i] = 1;
            else m[i] = 0;
// 2 Пункт
        int[] m1 = new int[8];
        for (int i=1; i<m1.length;i++){
           m1[i]+=3;
        }
// 3 Пункт
        int m2[]={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i:m2)
            if (m2[i] < 6) m2[i] *= 2;
// 4 Пункт
        int m3[][] = new int[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if ((i == j) || (i + j == 5)) m3[i][j] = 1;
// 5 Пункт
        int[] m4 = new int[10];
        for (int i:m4) m4[i] = r.nextInt(10);
        int max = m4[0];
        int min = m4[0];
        for (int i:m4)
            if (m4[i] > max) max = m4[i];
            else min = m4[i];
// 6 Пункт
        int[] m5={1,2,3,4,5,6};
        System.out.println(F1(m5));
// 7 Пункт
        F2(m5,2);
    }
}
