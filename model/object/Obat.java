package tubesPrototype1.model.object;

import tubesPrototype1.model.Objek;

public class Obat extends Objek {
    String kandungan;
    String aturanKonsumsi;
    String efekSamping;
    String tipe;
    int Stok;

    protected Obat(int id, String name) {
        super(id, name);
    }

    @Override
    public int getId() {
        return 0;
    }
}
