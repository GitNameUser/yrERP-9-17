package com.yr.entitys.bo;

import com.yr.entitys.Sale;

import java.io.Serializable;

public class SaleBO implements Serializable{//业务操作
    private Sale sale;

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
