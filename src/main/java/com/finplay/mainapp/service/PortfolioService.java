package com.finplay.mainapp.service;

import com.finplay.mainapp.entity.Portfolio;
import org.springframework.stereotype.Service;

@Service
public interface PortfolioService {
    Portfolio getPortfolio(Long userId);
    Portfolio createOrUpdatePortfolio(Portfolio portfolio);
    void addStockToPortfolio(Long userId, String stockSymbol, String stockName, int quantity, double price);

}