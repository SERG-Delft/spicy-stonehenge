package stockgrabber.provider;

import java.util.List;

import stockgrabber.model.StockData;

public interface StockDataProvider {
	public StockData getOneStockQuote(String ticker);
	public List<StockData> getManyStockQuotes(List<String> tickers);
}
