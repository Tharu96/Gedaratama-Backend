
package lk.gedaratama.backendserver.service;
import lk.gedaratama.backendserver.model.AdminDetail;
import lk.gedaratama.backendserver.repository.AdminDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Thathsara Liyanage on 7/12/2020.
 */
@Service
public class AdminDetailService {

    @Autowired
    private AdminDetailRepository adminDetailRepository;

    public AdminDetail getAdminDetailByUuid(String uuid){
        return adminDetailRepository.findAdminDetailByUserUuid(uuid);
    }
}