public class Main {
    public static void main(String[] args) {
        System.out.println(summ(5, 7));
        printSomeText();
        printMyText("My awesome text");
        switchTesting();
        forTesting();
        foreachTesting();
        System.out.println();
        nestedLoop();
        System.out.println();

        printAStar();
        printAStar2();
        System.out.println();
        printAStar3();
        System.out.println();
        printAStar4();
        System.out.println();
        printAStar5();
    }

    public static int summ(int a, int b) { //принимает числа и возвращает сумму
        return a + b;
    }

    public static void printSomeText() { //ничего не принимает и не возвращает, только печатает
        System.out.println("Some text)");
    }

    public static void printMyText(String textToPrint) { //принимает строку и печатает
        System.out.println(textToPrint);
    }

    public static void switchTesting() {
        int a = 0;
        switch (a) {
            case 1:
                System.out.println("a= 1");
                break;
            case 2:
                System.out.println("a= 2");
                break;
            case 3:
                System.out.println("a= 3");
                break;
            default:
                System.out.println("Ни один вариант не сработал");
        }
    }

    public static void forTesting() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i= " + i);
        }
        System.out.println("end");

        int x; //отрицательное приращение
        for (x = 15; x >= 0; x -= 5) {
            System.out.println("x= " + x);
        }
        //несколько управляющих переменных
        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);
        }

        for (int i = 0; i < 10; i++) { //выход из цикла по брейку
            if (i > 3) {
                break;
            }
            System.out.println("i = " + i);
        }
    }

    public static void foreachTesting() { //проходит по всем элементам массива
        String[] sm = {"A", "B", "Cucumber", "D",};
        for (String o : sm) {
            System.out.print(o + " ");
        }
    }

    public static void nestedLoop() {//вложенный цикл
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + i + j);
            }
        }
    }

    public static void printAStar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printAStar2() { //печатаем половину таблицы нулями
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j < 4) {
                    System.out.print("* ");
                } else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void printAStar3() { //рамка из звездочек
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || j == 0 || i == 7 || j == 7) { //размер таблицы -1
                    System.out.print("* ");
                } else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void printAStar4() { //в шахматном порядке
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) { //остаток от деления, если равен нулю, звезда
                    System.out.print("* ");
                } else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void printAStar5() { //пустая диагональ
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else if (i < j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
