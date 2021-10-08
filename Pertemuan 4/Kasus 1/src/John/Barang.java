package John;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok=0;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        setStok(stk);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok += stok;
    }
}