package tubesPrototype1.model.users;

import tubesPrototype1.model.Users;

import java.sql.Time;
import java.util.ArrayList;

public class Dokter extends Users {
    ArrayList<Pasien> listPasien = new ArrayList<>();
    String spesialis;

    protected Dokter(int id, String name, Time createdAt, Time updatedAt, Time deletedAt,
                     String email, String password, String noHp,
                     String spesialis
    ) {
        super(id, name, email, password, "Dokter", noHp);
        this.spesialis = spesialis;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
