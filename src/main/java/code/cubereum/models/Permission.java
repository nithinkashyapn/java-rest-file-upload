package code.cubereum.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Permission {

    @Id
    public ObjectId _id;

    public List<ObjectId> owners = new ArrayList<ObjectId>();

    public Permission(ObjectId creator){
        owners.add(creator);
    }
}
