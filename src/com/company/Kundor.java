package com.company;

public enum Kundor {

    MONDAY("Дуйшомбу куну техникалык сабак болот:"),
    TUESDAY("Шейшенби куну практикалык сабак болот:"),
    WEDNESDAY("Шаршенби куну техникалык сабак болот:"),
    THURSDAY("Бейшемби куну практикалык сабак болот:"),
    FRIDAY("Жума куну техникалык сабак болот:"),
    SATURDAY("Ишенби куну техникалык сабак болот:"),
    SUNDAY("Жекшемби куну сабак болбой эс алуу:");

    String raspisanie;

    Kundor(String raspisanie) {
        this.raspisanie = raspisanie;
    }

    @Override
    public String toString() {
        return "Kundor{" +
                "raspisanie='" + raspisanie + '\'' +
                "} " + super.toString();
    }
}
