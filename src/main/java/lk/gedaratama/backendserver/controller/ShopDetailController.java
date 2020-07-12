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
    public ResponseEntity<?> updateShopProfileDetail(@PathVariable("uuid") String uuid,  @RequestBody ShopDetail shopDetail) {
        //shopDetailService.saveShopProfileDetailByUuid(uuid);
        //ShopDetailService.saveShopProfileDetailByUuid(uuid);

        ShopDetail updates = ShopDetailRepository.findById(uuid);
        //.orElseThrow(() -> new ResourceNotFoundException("Shop not found for this id :: " + uuid));

        updates.setShopName(shopDetail.getShopName());
        updates.setShopOwnerName(shopDetail.getShopOwnerName());
        updates.setMobileNo(shopDetail.getMobileNo());
        updates.setLocation(shopDetail.getLocation());
        updates.setEmail(shopDetail.getEmail());
        updates.setNic(shopDetail.getNic());

        return ResponseEntity.ok(new MessageResponse("Successfully Updated"));
    }



}
