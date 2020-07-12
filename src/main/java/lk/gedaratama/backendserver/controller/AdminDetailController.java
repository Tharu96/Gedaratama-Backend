package lk.gedaratama.backendserver.controller;
import lk.gedaratama.backendserver.model.AdminDetail;
import lk.gedaratama.backendserver.service.AdminDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 * @author Thathsara Liyanage on 7/12/2020.
 */
@RestController
@RequestMapping("/admin_detail")
@CrossOrigin
public class AdminDetailController {

    @Autowired
    private AdminDetailService adminDetailService;

    @GetMapping(value = "/{uuid}")
    public ResponseEntity<?> getAdminDetailByUuid(@PathVariable String uuid){
        AdminDetail adminDetail=adminDetailService.getAdminDetailByUuid(uuid);
        return ResponseEntity.ok(adminDetail);
    }
}