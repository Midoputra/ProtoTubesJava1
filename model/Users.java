package tubesPrototype1.model;

import tubesPrototype1.MVC.Model;

abstract public class Users extends Model {
    String email;
    String password;
    String role;
    String gender;
    String noHp;
    protected Users(int id, String name,
                    String email, String password, String role, String noHp, String gender) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.role = role;
        this.gender = gender;
        this.noHp = noHp;
    }
    @Override
    abstract public int getId();
}
