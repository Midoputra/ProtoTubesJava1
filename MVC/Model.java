package tubesPrototype1.MVC;

import java.util.Date;

public abstract class  Model {
    public int id;
    public String name;
    protected String createdAt;
    String updatedAt;
    String deletedAt;
    protected Model(int id, String name) {
        Date date = new Date();
        this.id = id;
        this.name = name;
        this.createdAt = date.toString();
        this.updatedAt = date.toString();
        this.deletedAt = null;
    }
    abstract public int getId();
}
