package lk.gedaratama.backendserver.repository;
import lk.gedaratama.backendserver.model.AdminDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Thathsara Liyanage on 7/12/2020.
 */
public interface AdminDetailRepository  extends JpaRepository<AdminDetail,Integer>{

    AdminDetail findAdminDetailByUserUuid(String uuid);
}
