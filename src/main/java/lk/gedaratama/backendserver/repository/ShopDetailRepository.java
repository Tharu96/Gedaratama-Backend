package lk.gedaratama.backendserver.repository;

import lk.gedaratama.backendserver.model.ShopDetail;
import lk.gedaratama.backendserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sashini Tharuka on 6/13/2020.
 */
public interface ShopDetailRepository  extends JpaRepository<ShopDetail, Integer>{

    //static ShopDetail findById(String uuid);

    ShopDetail findShopDtailByUserUuid(String uuid);
    ShopDetail findByUuid(String uuid);

    //void shopDetailFindByUuid(String uuid);

    //void saveShopDetailByUuid(String uuid);

}
