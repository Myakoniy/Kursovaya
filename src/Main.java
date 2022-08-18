import org.w3c.dom.ls.LSOutput;

public class Main {
    private static final Employee[] sotrudniki = new Employee[10];

    public static void main(String[] args) {

        Employee sotrudnik1 = new Employee("Сарманов Пётр Васильевич", 3, 25000);
        Employee sotrudnik2 = new Employee("Новоселин Роман Николаевич", 5, 27000);
        Employee sotrudnik3 = new Employee("Корешев Илья Иванович", 1, 15000);
        Employee sotrudnik4 = new Employee("Кампушев Марат Агитович", 5, 37000);
        Employee sotrudnik5 = new Employee("Епифанова Лидия Сергеевна", 4, 21000);
        Employee sotrudnik6 = new Employee("Созонов Виктор Петрович", 2, 45000);
        Employee sotrudnik7 = new Employee("Романов Виталий Афанасьевич", 3, 67000);
        Employee sotrudnik8 = new Employee("Лимонова Надежда Петровна", 1, 19000);
        Employee sotrudnik9 = new Employee("Кормильцев Алексей Аркадьевич", 2, 28000);
        Employee sotrudnik10 = new Employee("Карташев Дмитрий Игнатьевич", 4, 31000);

        sotrudniki[0] = sotrudnik1;
        sotrudniki[1] = sotrudnik2;
        sotrudniki[2] = sotrudnik3;
        sotrudniki[3] = sotrudnik4;
        sotrudniki[4] = sotrudnik5;
        sotrudniki[5] = sotrudnik6;
        sotrudniki[6] = sotrudnik7;
        sotrudniki[7] = sotrudnik8;
        sotrudniki[8] = sotrudnik9;
        sotrudniki[9] = sotrudnik10;

        // System.out.println(sotrudnik1.toSring());

        for (int i = 0; i < sotrudniki.length; i++) {
            System.out.println(sotrudniki[i].toSring());
        }
        System.out.println("Общая сумма зарплат в месяц: " + summaZarplat());

        System.out.println("Минимальная зарплата: " + findMinZp().toSring());
        System.out.println("Максимальная зарплата: " + findMaxZp().toSring());
        System.out.println("Средняя зарплата сотрудников: " + middleZp());


    }

    public static int summaZarplat() {
        int sum = 0;
        for (Employee employee : sotrudniki) {
            sum += employee.getZarplata();
        }
        return sum;
    }

    public static Employee findMinZp() {
        Employee result = sotrudniki[0];
        int minZp = sotrudniki[0].getZarplata();
        for (Employee employee : sotrudniki) {
            if (employee.getZarplata() < minZp) {
                minZp = employee.getZarplata();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxZp() {
        Employee result = sotrudniki[0];
        int maxZp = sotrudniki[0].getZarplata();
        for (Employee employee : sotrudniki) {
            if (employee.getZarplata() > maxZp) {
                maxZp = employee.getZarplata();
                result = employee;
            }
        }
        return result;
    }

//    public static int getMinZp() {
//        return getMinZp();
//    }

    public static double middleZp() {
        double middleZp = summaZarplat() / sotrudniki.length;
        return middleZp;
    }




}