public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ урок 2 ч.2");

        System.out.println("Задача 1");
        int i6 = 1;
        System.out.println("Значение переменной byte с типом целочисленным равно 1");
        short s7 = 12;
        System.out.println("Значение переменной byte с типом целочисленным равно 12");
        long l8 = 100;
        System.out.println("Значение переменной byte с типом целочисленным равно 100");
        double v2 = 3.4E+38;
        System.out.println("Значение переменной byte с типом целочисленным равно 3.4E+38");
        float v3 = 1.5F;
        System.out.println("Значение переменной byte с типом целочисленным равно 1.5F");



        System.out.println("Задача 2");
        byte i = 2;
        System.out.println(2);
        short i1 = -159;
        System.out.println(-159);
        int i2 = 27897;
        System.out.println(27897);
        long l = 987678965549L;
        System.out.println(987678965549L);
        float v = 27.12F;
        System.out.println(27.12F);
        int i3 = 27897;
        System.out.println(27897);
        boolean b = false;
        System.out.println(false);
        int i4 = 569;
        System.out.println(569);
        int i5 = 786;
        System.out.println(786);
        double v1 = 67.;
        System.out.println(67);



        System.out.println("Задача 3");
        int class1Students = 23;
        int class2Students = 27;
        int class3Students = 30;
        int allStudents = class1Students+class2Students+class3Students;
        System.out.println("Всего учеников - " + allStudents);
        int allPaper = 480;
        System.out.println("Всего листов - " + allPaper);
        int paperFor1Students = allPaper/allStudents;
        System.out.println(paperFor1Students + " Листов - Количество бумаги на 1го ученика");


        System.out.println("Задача 4");
        byte machinePerformance = 16;
        byte time = 2;
        System.out.println("За 2мин машина произвела бутылок 16 штук");
        int performance = machinePerformance/time;
        System.out.println("За 1мин машина произвела бутылок " + performance + " штук");
        int performance20Min = performance * 20;
        System.out.println("За 20мин машина произвела бутылок " + performance20Min + " штук");
        int performance1Day = performance * 24;
        System.out.println("За сутки машина произвела бутылок " + performance1Day + " штук");
        int performance3Day = performance * 72;
        System.out.println("За сутки машина произвела бутылок " + performance3Day + " штук");
        int performance1Month = performance * 720;
        System.out.println("За месяц машина произвела бутылок " + performance1Month + " штук");


        System.out.println("Задача 5");
        int totalCansOfPaint = 120;
        System.out.println("Всего " +totalCansOfPaint+ " банок с краской");
        int cansOfWhitePaint = 2;
        System.out.println("Всего " +cansOfWhitePaint+ " банки с белой краской");
        int cansOfBrownPaint = 4;
        System.out.println("Всего " +cansOfBrownPaint+ " банки с коричневой краской");
        int paintsPerClass = 6;
        int ClassesAtSchool = totalCansOfPaint/paintsPerClass;
        System.out.println("Классов в школе - " + ClassesAtSchool);
        int whitePaint = totalCansOfPaint/3;
        int brownPaint = whitePaint * 2;
        System.out.println("В школе, где " +ClassesAtSchool+ " классов, нужно " +whitePaint+ " банок белой краски и " +brownPaint+ " банок коричневой краски");



        System.out.println("Задача 6");
        int bananas = 5*80;
        System.out.println("Количество бананов в коктейле - " + bananas + "гр");
        int milk = 105*2;
        System.out.println("Количество молока в коктейле - " + milk+ "гр");
        int iceCream = 100*2;
        System.out.println("Количество мороженного в коктейле - " + iceCream+ "гр");
        int rawEggs = 4*70;
        System.out.println("Количество яиц в коктейле - " + rawEggs + "гр");
        int totalIngredients = bananas + milk + iceCream + rawEggs;
        System.out.println("Всего коктейль весит - " + totalIngredients + "гр");
        float cocktailWeight = totalIngredients / 1000;
        System.out.println("Коктейль весит - " + cocktailWeight + "кг");




        System.out.println("Задача 7");
        int needToReset = 7*1000;
        System.out.println("Вес спортсмена " +needToReset+ "гр");
        int weightLossPeriod1 = needToReset/250;
        System.out.println("Ушло " +weightLossPeriod1+ " дней на похудение, при потере 250гр/день");
        int weightLossPeriod2 = needToReset/500;
        System.out.println("Ушло " +weightLossPeriod2+ " дней на похудение, при потере 500гр/день");


        System.out.println("Задача 8");
        int Masha1Salary = 67760;
        System.out.println("Нынешняя зп Маши - "+Masha1Salary);
        int salaryDenis1 = 83690;
        System.out.println("Нынешняя зп Дениса - "+salaryDenis1);
        int salaryChristina1 = 76230;
        System.out.println("Нынешняя зп Кристины - "+salaryChristina1);
        int salaryMasha2;
        salaryMasha2 = (int) (Masha1Salary * 0.1 + Masha1Salary);
        int salaryMashaEnd = salaryMasha2-Masha1Salary;
        System.out.println("Маша теперь получает " + salaryMasha2+ " рублей. Годовой доход вырос на " +salaryMashaEnd+ " рублей");
        int salaryDenis2;
        salaryDenis2 = (int) (salaryDenis1 * 0.1 + salaryDenis1);
        int salaryDenisEnd = salaryDenis2-salaryDenis1;
        System.out.println("Денис теперь получает " + salaryDenis2+ " рублей. Годовой доход вырос на " +salaryDenisEnd+ " рублей");
        int salaryChristina2;
        salaryChristina2 = (int) (salaryChristina1 * 0.1 + salaryChristina1);
        int salaryChristinaEnd = salaryChristina2-salaryChristina1;
        System.out.println("Кристина теперь получает " + salaryChristina2+ " рублей. Годовой доход вырос на " +salaryChristinaEnd+ " рублей");

    }
}