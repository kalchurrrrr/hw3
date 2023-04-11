public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte first = 20;
        System.out.println("Значение переменной first с типом byte равно " + first);
        short second = 525;
        System.out.println("Значение переменной second с типом short равно " + second);
        int third = 1808;
        System.out.println("Значение переменной third с типом int равно " + third);
        long fourth = 25348;
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        float fifth = -2.8f;
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        double sixth = 12.202d;
        System.out.println("Значение переменной sixth с типом double равно " + sixth);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte liudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int students = liudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short paper = 480;
        int solution = paper / students;
        System.out.println("На каждого ученика рассчитано " + solution + " листов бумаги ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte inOneMinute = 16 / 2;
        int inTwentyMinutes = inOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + inTwentyMinutes + " штук бутылок");
        int inDay = inOneMinute * 60 * 24;
        System.out.println("За день машина произвела " + inDay + " штук бутылок");
        int inThreeDays = inDay * 3;
        System.out.println("За 3 дня машина произвела " + inThreeDays + " штук бутылок");
        int inOneMonth = inDay * 30;
        System.out.println("За месяц машина произвела " + inOneMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte allColours = 120;
        int oneClass = allColours / 6;
        int whitColour = oneClass * 2;
        int brownColour = oneClass * 4;
        System.out.println("В школе, где " + oneClass + " классов, нужно " + whitColour + " банок белой краски и " + brownColour + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        int moreBananas = banana * 5;
        int moreMilk = milk * 2;
        int moreIceCream = iceCream * 2;
        int moreEggs = eggs * 4;
        int totalGrams = moreBananas + moreMilk + moreIceCream + moreEggs;
        System.out.println("Грамм равно " + totalGrams);
        float totalKilograms = totalGrams / 1000f;
        System.out.println("Килограммов равно " + totalKilograms);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int weight = 7000;
        short firstWeight = 250;
        short secondWeight = 500;
        int inOneDayFirst = weight / firstWeight;
        System.out.println(inOneDayFirst + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        int inOneDaySecond = weight / secondWeight;
        System.out.println(inOneDaySecond + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        float mashaNew = ((masha / 100f) * 10f) + masha;
        int mashaOneYear = masha * 12;
        float mashaOneYearNew = (mashaOneYear / 100f) * 10f;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaOneYearNew + " рублей");
        int denis = 83690;
        float denisNew = ((denis / 100f) * 10f) + denis;
        int denisOneYear = denis * 12;
        float denisOneYearNew = (denisOneYear / 100f) * 10f;
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisOneYearNew + " рублей");
        int kristina = 76230;
        float kristinaNew = ((kristina / 100f) * 10f) + kristina;
        int kristinaOneYear = kristina * 12;
        float kristinaOneYearNew = (kristinaOneYear / 100f) * 10f;
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaOneYearNew + " рублей");
    }
}