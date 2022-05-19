package tubesPrototype1.model.users;

import tubesPrototype1.model.Users;

public class Admin extends Users {
    protected Admin(int id, String name, String email, String password, String gender, String noHp) {
        super(id, name, email, password, "Admin", gender, noHp);
    }

    @Override
    public int getId() {
        return this.id;
    }
}
