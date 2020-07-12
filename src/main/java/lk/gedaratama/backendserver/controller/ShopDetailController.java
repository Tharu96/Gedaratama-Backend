package lk.gedaratama.backendserver.controller;


import lk.gedaratama.backendserver.model.ShopDetail;
import lk.gedaratama.backendserver.repository.ShopDetailRepository;
import lk.gedaratama.backendserver.resource.ShopDetailResource;
import lk.gedaratama.backendserver.response.MessageResponse;
import lk.gedaratama.backendserver.service.ShopDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop_profile")
@CrossOrigin
public class ShopDetailController {

    private final ShopDetailService shopDetailService;

    public ShopDetailController(ShopDetailService shopDetailService) {
        this.shopDetailService = shopDetailService;
    }

    @GetMapping(value="/{view/uuid}")
    public ResponseEntity<?> getShopDetailsByUuid(@PathVariable String uuid){
        ShopDetail shopDetail= shopDetailService.getShopDetailsByUuid(uuid);
        return ResponseEntity.ok(shopDetail);
    }

    @PutMapping(value="/{update/uuid}")
    public ResponseEntity<?> updateShopProfileDetail(@PathVariable("uuid") String uuid,  @RequestBody ShopDetailResource shopDetailResource) {


        shopDetailService.getShopUpdates(shopDetailResource, uuid);

        return ResponseEntity.ok(new MessageResponse("Successfully Updated"));
    }



}
