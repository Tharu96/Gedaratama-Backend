package lk.gedaratama.backendserver.controller;

import lk.gedaratama.backendserver.model.DelpersonDetail;
import lk.gedaratama.backendserver.service.DeliveryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Lakshima Prabhani created on 7/11/2020
 */

@RestController
@RequestMapping("/delivery_person_detail")
@CrossOrigin
public class ViewDeliveryProfileController {
    private final DeliveryDetailService getDeliveryProfileByEmail;


    @Autowired
    public ViewDeliveryProfileController(DeliveryDetailService getDeliveryProfileByEmail) {
        this.getDeliveryProfileByEmail = getDeliveryProfileByEmail;
    }

    @GetMapping(value = "/email")
    public ResponseEntity<DelpersonDetail> viewDeliveryProfileByEmail(@PathVariable String email){
        DelpersonDetail viewDeliveryProfileList= DeliveryDetailService.getDeliveryProfileByEmail(email);
        return ResponseEntity.ok(viewDeliveryProfileList);
    }
}
