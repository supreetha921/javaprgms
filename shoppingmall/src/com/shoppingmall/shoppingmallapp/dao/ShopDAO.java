package com.shoppingmall.shoppingmallapp.dao;
import java.util.*;

import com.shoppingmall.shoppingmallapp.dto.ShopsDTO;
public interface ShopDAO {
	
	public void saveShop(ShopsDTO shopsDTO);
	public Collection<ShopsDTO>getAllShops();
	public void updateFloorByName(String floor,String name);
	public void deleteShopById(int shopId);

}
