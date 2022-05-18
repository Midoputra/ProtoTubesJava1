package tubesPrototype1.model;

import tubesPrototype1.MVC.Model;

import java.sql.Time;

abstract public class Users extends Model {
    String email;
    String password;
    String role;
    String noHp;
    protected Users(int id, String name,
                    String email, String password, String role, String noHp) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.role = role;
        this.noHp = noHp;
    }
    abstract public int getId();
}
