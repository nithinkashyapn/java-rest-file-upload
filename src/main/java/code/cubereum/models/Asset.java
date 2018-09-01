package code.cubereum.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Asset {

    @Id
    public ObjectId _id;

    public int version;
    public long timestamp;
    public String URL;

    public Asset(){}

    public Asset(ObjectId id, int version, long timestamp, String URL) {
        this._id = id;
        this.version = version;
        this.timestamp = timestamp;
        this.URL = URL;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
