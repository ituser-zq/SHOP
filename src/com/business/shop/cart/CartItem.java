package com.business.shop.cart;

import com.business.shop.product.Product;

/**
 * 购物项:
 * @author ZQ
 *
 */
public class CartItem {
	// 商品对象
	private Product product;
	// 数量
	private Integer count;
	// 小计
	private Double subtotal;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public Double getSubtotal() {
		return count * product.getShop_price();
	}
	
}
