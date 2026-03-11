import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ClassActivity6_1_Queue {
    public static void main(String[] args) {

    Queue<Integer> queue = new PriorityQueue<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Masukkan Angka");
    String barisInput = scanner.nextLine();

    Queue<Integer> queueDiterima = new PriorityQueue<>();
    Queue<Integer> queueDitolak = new PriorityQueue<>();

    String[] Dataumur = barisInput.split(" ");
    for (String data : Dataumur) {
        int umur = Integer.parseInt(data);
        if (umur >= 28 && umur <= 118) {
        queueDiterima.add(umur);
        System.out.println("Diterima : " + queueDiterima);

    }   else {
        queueDitolak.add(umur);
        System.out.println("Ditolak : " + queueDitolak);
    }
    }
    }
}
