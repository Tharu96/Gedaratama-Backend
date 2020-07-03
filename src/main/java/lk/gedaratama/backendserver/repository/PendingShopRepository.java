package lk.gedaratama.backendserver.repository;

import lk.gedaratama.backendserver.model.PendingShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Sashini Tharuka on 5/31/20
 */
@Repository
public interface PendingShopRepository extends JpaRepository<PendingShop, Integer> {


    PendingShop findByUuid(String uuid);
    List<PendingShop> findAllByIsPublishedFalse();

    @Transactional
    @Modifying
    @Query("update PendingShop p SET p.isPublished= true WHERE p.uuid=:uuid")
    void publishedPendingShop(@Param("uuid") String uuid);

    @Transactional
    void deleteByUuid(String uuid);


}