public class Main {

    Employee[] Sotrudniki = new Employee [10];

    public static void main(String[] args) {

        Employee sotrudnik1 = new Employee("Сарманов Пётр Васильевич ", 3, 25000);
        System.out.println(sotrudnik1.getFullName()+sotrudnik1.getOtdel()+sotrudnik1.getZarplata());

    }
}