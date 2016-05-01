/*
 * 文 件 名: StockMarket.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2016, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2016-1-7 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.veerasundar.easymock;

/**
 * @author Administrator
 * @version [版本号, 2016-1-7]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class StockMarket {
    public Double getPrice(String stockName) {
        double price = 0.00;
        if ("unis".equals(stockName)) {
            price = 63.50;
        }
        else if ("alibaba".equals(stockName)) {
            price = 1000.00;
        }
        return price;
    }
    
    public Double getRate(String stockName) throws ArithmeticException {
        double rate = 0.00;
        if ("unis".equals(stockName)) {
            rate = getPrice(stockName) / 0;
        }
        else if ("alibaba".equals(stockName)) {
            rate = getPrice(stockName) / 100;
        }
        return rate;
    }
}
