package com.shoppingmall.shoppingmallapp;

import java.util.Collection;

import com.shoppingmall.shoppingmallapp.dao.ShopDAO;

import com.shoppingmall.shoppingmallapp.dao.ShopDAOImpl;
import com.shoppingmall.shoppingmallapp.dto.ShopsDTO;


public class ShoppingUtil {
	public static void main(String[]args) {
		ShopsDTO shopsDTO=new ShopsDTO();
		shopsDTO.setShopId(23);
		shopsDTO.setFloor("1st Floor");
		shopsDTO.setShopName("Trends");
		shopsDTO.setType("Clothing");
		
		ShopDAOImpl dao=new ShopDAOImpl();
		dao.saveShop(shopsDTO);
		Collection<ShopsDTO> dtos=dao.getAllShops();
		for (ShopsDTO shopsDTO2 : dtos) {
			System.out.println(shopsDTO2);
			
		}
		dao.updateFloorByName("3rd Floor", "Trends");

		Collection<ShopsDTO> dtos1 = dao.getAllShops();
		for (ShopsDTO shopsDTO2 : dtos1) {
			System.out.println(shopsDTO2);
		}
		dao.deleteShopById(23);

		Collection<ShopsDTO> dtos2 = dao.getAllShops();
		if (dtos2 != null) {
			for (ShopsDTO shopsDTO2 : dtos2) {
				System.out.println(shopsDTO2);
			}
		}
	}
	
}
