package lk.gedaratama.backendserver.service;

import lk.gedaratama.backendserver.model.ShopDetail;
import lk.gedaratama.backendserver.repository.ShopDetailRepository;
import lk.gedaratama.backendserver.resource.ShopDetailResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sashini Tharuka on 6/13/2020.
 */
@Service
public class ShopDetailService {

    @Autowired
    private ShopDetailRepository shopDetailRepository;

    public ShopDetail saveShopDetail(ShopDetail shopDetail) {
        return shopDetailRepository.save(shopDetail);
    }

    public ShopDetail getShopDetailsByUuid(String uuid){
        return shopDetailRepository.findShopDtailByUserUuid(uuid);
    }

    public ShopDetail getShopUpdates(ShopDetailResource shopDetailResource, String uuid){

        ShopDetail existingShop= ShopDetailRepository.findByUuid(uuid);
        existingShop.setShopName(shopDetailResource.getShopName());
        existingShop.setShopOwnerName(shopDetailResource.getShopOwnerName());
        existingShop.setMobileNo(shopDetailResource.getMobileNo());
        existingShop.setLocation(shopDetailResource.getLocation());
        existingShop.setEmail(shopDetailResource.getEmail());
        existingShop.setNic(shopDetailResource.getNic());

        return shopDetailRepository.save(existingShop);
    }





}
