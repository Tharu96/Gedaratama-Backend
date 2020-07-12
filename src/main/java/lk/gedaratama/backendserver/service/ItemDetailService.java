package lk.gedaratama.backendserver.service;

import lk.gedaratama.backendserver.model.ItemDetail;
import lk.gedaratama.backendserver.repository.ItemDetailRepository;
import lk.gedaratama.backendserver.resource.ItemDetailResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sashini Tharuka on 7/12/2020.
 */
@Service
public class ItemDetailService {

    @Autowired
    private ItemDetailRepository itemDetailRepository;

    public ItemDetail saveItemDetail(ItemDetailResource itemDetailResource){
        ItemDetail itemDetail=new ItemDetail();
        itemDetail.setShopUuid(itemDetailResource.getShopUuid());
        itemDetail.setItemName(itemDetailResource.getItemName());
        itemDetail.setDescription(itemDetailResource.getDescription());
        itemDetail.setQty(itemDetailResource.getQty());
        itemDetail.setDailyAmount(itemDetailResource.getDailyAmount());
        itemDetail.setPrice(itemDetailResource.getPrice());
        itemDetail.setDiscount(itemDetailResource.getDiscount());
        return itemDetailRepository.save(itemDetail);
    }

    public List<ItemDetailResource> getItemDetailByShopUuid(String uuid){
        List<ItemDetailResource> itemDetailResourceList = new ArrayList<>();
        itemDetailRepository.findAllByShopUuid(uuid).forEach(itemDetail -> {
            ItemDetailResource itemDetailResource = new ItemDetailResource();
            itemDetailResource.setItemId(itemDetail.getItemId());
            itemDetailResource.setItemName(itemDetail.getItemName());
            itemDetailResource.setDescription(itemDetail.getDescription());
            itemDetailResource.setQty(itemDetail.getQty());
            itemDetailResource.setDailyAmount(itemDetail.getDailyAmount());
            itemDetailResource.setPrice(itemDetail.getPrice());
            itemDetailResource.setDiscount(itemDetail.getDiscount());
            itemDetailResourceList.add(itemDetailResource);
        });

        return itemDetailResourceList;
    }

    public void deleteItemDetail(String uuid) {
        itemDetailRepository.deleteByShopUuid(uuid);


    }
}
