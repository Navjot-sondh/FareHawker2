package com.farehawker.Model;

/**
 * Created by FareHawker.com on 27-02-2018.
 */

public class OfferModel {
    public String  productImage;
    public String productFrom,productTo,productPrice;

    public String  getProductImage() {
        return productImage;
    }
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    public String getProductFrom() {
        return productFrom;
    }
    public void setProductFrom(String productFrom) {
        this.productFrom = productFrom;
    }
    public String getProductTo() {
        return productTo;
    }
    public void setProductTo(String productTo) {
        this.productTo = productTo;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}

