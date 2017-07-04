package optionals;

import java.util.Optional;

public class Department {
    private Manager boss;

    public Optional<Manager> getBoss() {
        return Optional.ofNullable(boss);
    }

    public void setBoss(Manager boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Department{" +
                "boss=" + boss +
                '}';
    }
}
