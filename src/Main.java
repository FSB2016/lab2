import java.util.Scanner;
class Main{

    public static void main(String[] args) {

        drow100();

        int ii, jj;
        Scanner s = new Scanner(System.in);



        System.out.print("\nВведите длинну по x\n");
        jj = s.nextByte();

        System.out.print("Введите длинну по y\n");
        ii = s.nextByte();

        drow2(ii,jj);

        drow3();

        System.out.print("\nФунция минимума\n");
        System.out.print("\nВведите цифру 1\n");
        ii = s.nextByte();
        System.out.print("Введите цифру 2\n");
        jj = s.nextByte();
        System.out.print("\n" + Math.min(ii, jj) + "\n");

        String name1, name2;
        char nm1[], nm2[];
        System.out.print("Введите первое имя\n");
        name1 = s.next();
        System.out.print("Введите второе имя\n");
        name2 = s.next();

        NAME(name1, name2);

        int c, d;
        System.out.print("Введите цифру 1\n");
        ii= s.nextByte();
        System.out.print("Введите цифру 2\n");
        jj= s.nextByte();
        System.out.print("Введите цифру 3\n");
        c=s.nextByte();
        System.out.print("Введите цифру 4\n");
        d = s.nextByte();
        System.out.print("Минимальное из 4 это " + mm(ii,jj,c,d));


        System.out.print("\nВведите кординату x неравную нулю\n");
        ii=jj=0;
        while(ii==0){
            ii= s.nextByte();
        }

        System.out.print("Введите кординату y\n");
        while(jj==0){
            jj= s.nextByte();
        }
        cord(ii,jj);
    }

    public static void drow2(int x, int y){

        System.out.print("Рисуем квадрат\n");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('8');
            }
            System.out.print('\n');
        }
    }

    public static void drow3(){

        System.out.print("\nВыводим треугольник\n");

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('8');
            }
            System.out.print('\n');
        }
    }

    public static void drow100(){
        System.out.print("выводим от 1 до 100\n");

        for (int i = 1; i != 101; i++) {
            System.out.print(i + " ");
        }
    }

    public static int mm(int a, int b, int c, int d){
        a = Math.min(a,b);
        a = Math.min(a,c);
        a = Math.min(a,d);
        return a;
    }

    public static void NAME(String name1, String name2){
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        char nm1[] = name1.toCharArray();
        char nm2[] = name2.toCharArray();

        int ii = name1.length();
        int jj = name2.length();

        if (ii == jj) {
            int i = 0;
            while (i != ii) {
                if (nm1[i] != nm2[i]) {
                    System.out.print("имена не совпали\n");
                    break;
                }
                i++;
            }
            if (i != ii) {
                System.out.print("имена не совпали\n");
            } else {System.out.print("имена совпали\n");}
        }else{ System.out.print("имена не совпали\n"); }

    }

    public static  void cord(int x, int y){
        if(x>0){ x = 1; } else { x = 2; }
        if(y>0){ x += 0; } else { x +=3; }
        System.out.print("Точка в "+ x + " четверти\n");
    }
}