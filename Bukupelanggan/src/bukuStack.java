public class bukuStack {
    Buku top;

    public bukuStack(){
        this.top = null;
    }

    public void push(String judul){
        Buku newBuku = new Buku(judul);
        if (top == null){
            top = newBuku;
        }else{
            newBuku.next = top;
            top = newBuku;
        }
    }

    public Buku pop(){
        if (top == null){
            return null;
        }
        Buku temp = top;
        top = top.next;
        return temp;
    }

    public void printBuku(){
        Buku current = top;
        while (current != null){
            System.out.println("   -" + current.judul);
            current = current.next;
        }
    }
}
