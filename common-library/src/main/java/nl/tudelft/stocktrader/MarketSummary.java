package nl.tudelft.stocktrader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MarketSummary {
	protected BigDecimal tsia;
    protected BigDecimal openTSIA;
    protected Double volume;
    protected List<Quote> topGainers = new ArrayList<Quote>();
    protected List<Quote> topLosers = new ArrayList<Quote>();
    protected Calendar summaryDate;

	public MarketSummary(BigDecimal tSIA, BigDecimal openTSIA,
			double volume, List<Quote> topGainers,
			List<Quote> topLosers) {
		setTSIA(tSIA);
		setOpenTSIA(openTSIA);
		setVolume(volume);
		setTopGainers(topGainers);
		setTopLosers(topLosers);
	}

	private void setTopGainers(List<Quote> topGainers) {
        this.topGainers.addAll(topGainers);
	}

    public List<Quote> getTopGainers() {
        return topGainers;
    }

    private void setTopLosers(List<Quote> topLosers) {
        this.topLosers.addAll(topLosers);
	}

    public List<Quote> getTopLosers() {
        return topLosers;
    }

    public BigDecimal getTSIA() {
        return tsia;
    }

    public void setTSIA(BigDecimal tsia) {
        this.tsia = tsia;
    }

    public BigDecimal getOpenTSIA() {
        return openTSIA;
    }

    public void setOpenTSIA(BigDecimal openTSIA) {
        this.openTSIA = openTSIA;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Calendar getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(Calendar summaryDate) {
        this.summaryDate = summaryDate;
    }
}
