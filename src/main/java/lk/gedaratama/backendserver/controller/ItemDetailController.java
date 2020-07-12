package lk.gedaratama.backendserver.controller;

import lk.gedaratama.backendserver.resource.ItemDetailResource;
import lk.gedaratama.backendserver.response.MessageResponse;
import lk.gedaratama.backendserver.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sashini Tharuka on 7/12/2020.
 */
@RestController
@RequestMapping("/item_detail")
@CrossOrigin
public class ItemDetailController {

    private final ItemDetailService itemDetailService;

    @Autowired
    public ItemDetailController(ItemDetailService itemDetailService) {
        this.itemDetailService = itemDetailService;
    }

    @PostMapping
    public ResponseEntity<?> saveItemDetail(@RequestBody ItemDetailResource itemDetailResource){
        itemDetailService.saveItemDetail(itemDetailResource);
        return ResponseEntity.ok(new MessageResponse("Item details Successfully Added."));
    }

    @GetMapping(value = "/{uuid}")
    public ResponseEntity<?> getItemDetailByShopUuid(@PathVariable("uuid") String uuid){
        List<ItemDetailResource> itemDetailResourceList=itemDetailService.getItemDetailByShopUuid(uuid);
        return ResponseEntity.ok(itemDetailResourceList);
    }

    @DeleteMapping(value = "/delete/{uuid}")
    public ResponseEntity<?> deleteItemDetail(@PathVariable("uuid") String uuid) {
        itemDetailService.deleteItemDetail(uuid);
        return ResponseEntity.ok(new MessageResponse("Item Deleted"));
    }

}
