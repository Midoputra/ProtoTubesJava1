package tubesPrototype1.model.object;

import tubesPrototype1.model.Objek;

import java.util.List;

public class RekamMedis extends Objek {
    String tanggal;
    String keluhan;
    int idPasien;
    int beratBadanPasien;
    int tinggiBadanPasien;
    String tekananDarah;
    List<Integer> idObat;

    protected RekamMedis(
            int id, String name,
            String keluhan, int idPasien, int beratBadanPasien, int tinggiBadanPasien, String tekananDarah
    ) {
        super(id, name);
        this.tanggal = this.createdAt;
        this.keluhan = keluhan;
        this.idPasien = idPasien;
        this.beratBadanPasien = beratBadanPasien;
        this.tinggiBadanPasien = tinggiBadanPasien;
        this.tekananDarah = tekananDarah;
    }


    @Override
    public int getId() {
        return 0;
    }
}
