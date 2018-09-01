package code.cubereum.endpoints;

import code.cubereum.controllers.AssetController;

import code.cubereum.models.Asset;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetEndpoints {


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addOneAsset(@RequestParam("URL") String URL){

        System.out.print("--------------URL-------------");
        System.out.println(URL);

        AssetController assetController = new AssetController();
        assetController.addAsset(URL);
        return "Success";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String addOneFileAsset(@RequestParam("file") MultipartFile URL){

        System.out.print("--------------URL-------------");
        System.out.println(URL.getContentType());
        System.out.println(URL.getSize());
        System.out.println(URL.getContentType());
        System.out.println(URL.getOriginalFilename());

//        AssetController assetController = new AssetController();
//        assetController.addAsset(URL);
        return "Success";
    }
}
