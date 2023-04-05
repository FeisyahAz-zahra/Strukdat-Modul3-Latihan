import java.util.ArrayList;

public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("Hewan : ");
        System.out.print(Hewan);

        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        ArrayList<String> DataDelete = new ArrayList<>();
        for (String hapus : DeleteHewan){
            Hewan.removeIf(h -> h.equals(hapus));
            DataDelete.add(hapus);
        }

        System.out.println("\n\nData Hewan Yang Dihapus : ");
        System.out.print(DataDelete);

        System.out.println("\n\nOutput Hewan : ");
        System.out.println(Hewan);

    }


}
