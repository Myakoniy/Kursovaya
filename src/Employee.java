public class Employee {

    String fullName;
    private int otdel;
    private int zarplata;
    private static int id = 0;

    public Employee(String fullName, int otdel, int zarplata, int id) {
        this.fullName = fullName;
        this.otdel = otdel;
        this.zarplata = zarplata;
        this.id = id++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getZarplata() {
        return zarplata;
    }

    public static int getId() {
        return id;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setZarplata(int zarplata) {
        this.zarplata = zarplata;
    }
}
