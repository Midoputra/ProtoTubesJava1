package tubesPrototype1.model.users;

import tubesPrototype1.model.Users;

import java.sql.Time;
import java.util.ArrayList;

public class Admin extends Users {
    protected Admin(int id, String name, String email, String password, String noHp) {
        super(id, name, email, password, "Admin", noHp);
    }

    @Override
    public int getId() {
        return this.id;
    }
}
