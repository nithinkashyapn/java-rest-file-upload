package code.cubereum.repositories;

import code.cubereum.models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
    User findBy_id(ObjectId _id);
}
