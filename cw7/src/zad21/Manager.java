package zad21;

import java.util.Objects;

public class Manager {
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        result = super.hashCode();
        long temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
