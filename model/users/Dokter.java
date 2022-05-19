package tubesPrototype1.model.users;

import tubesPrototype1.model.Users;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;

public class Dokter extends Users {
    ArrayList<Pasien> listPasien = new ArrayList<>();
    String spesialis;
    protected Dokter(int id, String name, Time createdAt, Time updatedAt, Time deletedAt,
                     String email, String password, String gender, String noHp,
                     String spesialis
    ) {
        super(id, name, email, password, "Dokter",gender, noHp);
        this.spesialis = spesialis;
    }
    @Override
    public int getId() {
        return this.id;
    }
    public void addPasien(Pasien pasien){
        this.listPasien.add(pasien);
    }
    public void addPasienBanyak(Collection<Pasien> listPasien){
        this.listPasien.addAll(listPasien);
    }
    public void removePasien(Pasien pasien){
        this.listPasien.remove(pasien);
    }
    public void editPasien(int id, Pasien pasien){
        for(int i = 0; i < this.listPasien.size(); i++){
            if(this.listPasien.get(i).getId() == id){
                this.listPasien.set(i, pasien);
            }
        }
    }
}
