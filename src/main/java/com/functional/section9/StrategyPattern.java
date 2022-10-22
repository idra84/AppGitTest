package com.functional.section9;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {

    public static void main(String[] args) {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL",318.56,100));
        stockList.add(new Stock("MSFT",166.56,45));
        stockList.add(new Stock("GOOGLE",99,12.5));
        stockList.add(new Stock("AMZ",1866.74,45));
        stockList.add(new Stock("AAPL",318.65,8));
        stockList.add(new Stock("ABA",1866.74,9));

        StockFilters.bySymbol(stockList, "AMZ").forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        StockFilters.byPriceAbove(stockList,300).forEach(System.out::println);
    }
}
