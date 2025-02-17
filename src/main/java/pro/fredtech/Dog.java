package pro.fredtech;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import java.time.LocalDate;

public class Dog extends PanacheMongoEntity {
    public String name;
    public String race;
    public LocalDate dateOfBirth;
}