package lk.gedaratama.backendserver.repository;

import lk.gedaratama.backendserver.model.ItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Sashini Tharuka on 7/12/2020.
 */
public interface ItemDetailRepository  extends JpaRepository<ItemDetail,Integer>{

    List<ItemDetail> findAllByShopUuid(String uuid);

    @Transactional
    void deleteByShopUuid(String uuid);
}
