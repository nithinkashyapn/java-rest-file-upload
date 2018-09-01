package code.cubereum.controllers;

import code.cubereum.models.Asset;
import code.cubereum.repositories.AssetRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import java.util.List;

public class AssetController {

    @Autowired
    private AssetRepository assetRepository;

    public void addAsset(String URL){

        System.out.println("assAsset() - URL");
        System.out.println(URL);

        Asset temp = new Asset(new ObjectId(), 1, 123456, URL);

        System.out.println("assAsset() - ID");
        System.out.println(temp.get_id());
        System.out.println(temp.getTimestamp());
        System.out.println(temp.getURL());
        System.out.println(temp.getVersion());

        System.out.println("----------------------ASSET----------------");
        System.out.println(temp);

        assetRepository.save(temp);

        System.out.println("----------------------SAVE----------------");
    }
}
