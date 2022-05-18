package tubesPrototype1.model.users;

import tubesPrototype1.model.Users;

import java.sql.Time;

public class Pasien extends Users {
    int umur;
    String alamat;

    Pasien(int id, String name, Time createdAt, Time updatedAt, Time deletedAt,
           String email, String password, String noHp,
           int umur, String alamat
    ) {
        super(id, name, email, password, "Pasien", noHp);
        this.alamat = alamat;
        this.umur = umur;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
