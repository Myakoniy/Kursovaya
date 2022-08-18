public class Main {
    private static final Employee[] sotrudniki = new Employee [10];

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


        System.out.println(sotrudnik1.toSring());

    }

    public static void printSotrudniki() {
        for (i= 0, i<sotrudniki.length, i++) {
            System.out.println(sotrudniki[i]);
        }
    }



}