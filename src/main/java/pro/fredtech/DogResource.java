package pro.fredtech;

import io.quarkus.mongodb.rest.data.panache.PanacheMongoEntityResource;
import org.bson.types.ObjectId;

public interface DogResource extends PanacheMongoEntityResource<Dog, ObjectId> {
}