package lk.gedaratama.backendserver.repository;

import lk.gedaratama.backendserver.model.DelpersonDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kavindya Sewwandi on 5/31/20
 */
@Repository
public interface DeliveryDao extends JpaRepository<DelpersonDetail, Integer> {

    DelpersonDetail findByEmail(String email);

    DelpersonDetail findByUuid(String uuid);

}