package tubesPrototype1.model.object;

import tubesPrototype1.model.Objek;

import java.util.List;

public class RiwayatKunjungan extends Objek {
    int idDokter;
    int idPasien;
    String diagnosa;
    List<Integer> listObat;
    protected RiwayatKunjungan(int id, String name, int idDokter, int idPasien, String diagnosa) {
        super(id, name);
        this.idDokter = idDokter;
        this.idPasien = idPasien;
        this.diagnosa = diagnosa;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
