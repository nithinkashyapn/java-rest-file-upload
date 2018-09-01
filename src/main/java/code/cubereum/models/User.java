package code.cubereum.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    public ObjectId _id;

    public ObjectId assetId;
    public ObjectId permissionId;

    public User(){}

    public User(ObjectId assetId, ObjectId permissionId) {
        this.assetId = assetId;
        this.permissionId = permissionId;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getAssetId() {
        return assetId;
    }

    public void setAssetId(ObjectId assetId) {
        this.assetId = assetId;
    }

    public ObjectId getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(ObjectId permissionId) {
        this.permissionId = permissionId;
    }
}
