package code.cubereum.repositories;

import code.cubereum.models.Asset;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssetRepository extends MongoRepository<Asset, String>{
    Asset findBy_id(ObjectId _id);
    Asset findByURL(String URL);
}
