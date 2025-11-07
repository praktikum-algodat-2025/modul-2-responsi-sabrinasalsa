public class pelangganQueue {
    Pelanggan front, rear;

    public pelangganQueue(){
        this.front = this.rear = null;
    }

    public void enqueue(Pelanggan newPelanggan){
        if (front == null){
            front = rear = newPelanggan;
        }else{
            rear.next = newPelanggan;
            rear = newPelanggan;
        }
    }
    public Pelanggan dequeue(){
        if(front == null){
            return null;
        }
        Pelanggan temp = front;
        front = front.next;
        return temp;
    }

    public void popBukuPelanggan(int nomor, int jumlahPop) {
        Pelanggan current = front;
        int i = 1;

        while (current != null && i < nomor) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Pelanggan ke-" + nomor + " tidak ditemukan!");
            return;
        }

        for (int j = 0; j < jumlahPop; j++) {
            current.daftarBuku.pop();  
        }
    }


    public void printQueue(){
        Pelanggan current = front;
        int nomor = 1;
        while(current != null){
            System.out.println("Pelanggan ke-"+ nomor);
            current.daftarBuku.printBuku();
            current = current.next;
            nomor++;
        }
        System.out.println();
    }
}
