package tubesPrototype1.model.object;

import tubesPrototype1.model.Objek;

import java.util.List;

public class Ruangan extends Objek {
    int idDokter;
    int idPasien;
    String diagnosa;
    List<Integer> listObat;
    protected Ruangan(int id, String name, int idDokter, int idPasien, String diagnosa) {
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
