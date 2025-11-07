public class Main {
    public static void main(String[] args) {
        pelangganQueue antrian = new pelangganQueue();

        bukuStack b1 = new bukuStack();
        b1.push("Technical Analysis");
        b1.push("Fundamental Analysis");
        b1.push("Data Analysis");
        antrian.enqueue(new Pelanggan(b1));

        bukuStack b2 = new bukuStack();
        b2.push("Clean Code");
        b2.push("The Pragmatic Programmer");
        b2.push("Design Patterns");
        antrian.enqueue(new Pelanggan(b2));

        bukuStack b3 = new bukuStack();
        b3.push("Dune");
        b3.push("Foundation");
        b3.push("Hyperion");
        b3.push("Neuromancer");
        antrian.enqueue(new Pelanggan(b3));

        bukuStack b4 = new bukuStack();
        b4.push("Sapiens: A Brief History of Humankind");
        b4.push("Guns, Germs, and Steel");
        b4.push("The Silk Roads");
        antrian.enqueue(new Pelanggan(b4));

        System.out.println("=== Antrian Awal ===");
        antrian.printQueue();

        antrian.dequeue();
        System.out.println("=== Setelah pelanggan ke-1 di-dequeue ===");
        antrian.printQueue();

        bukuStack b5 = new bukuStack();
        b5.push("Tangkuban Perahu");
        b5.push("Timun Mas");
        b5.push("Resep Ayam Goyeng Upin Ipin");
        antrian.enqueue(new Pelanggan(b5));

        System.out.println("=== Setelah pelanggan baru enqueue ===");
        antrian.printQueue();
        
        antrian.popBukuPelanggan(1, 2);
        System.out.println("=== pelanggan ke-1 pop 2 kali ===");
        antrian.printQueue();
    }
}
