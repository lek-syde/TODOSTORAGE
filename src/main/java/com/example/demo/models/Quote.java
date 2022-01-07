package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class Quote {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int quoteRef;
	
	
	int mainSize;
	String mainFullPricePerMonth;
	String mainFullPricePerWeek;
	String mainDiscountedPricePerMonth;
	String mainDiscountedPricePerWeek;
	String mainDiscountPerMonthDescription;
	String mainDiscountPerWeekDescription;
	int upgradeSize;
	String upgradePricePerWeek;
	boolean showLimitedAvailability=false;
	boolean showUpgradeOption=false;
	boolean showNationalStorageMessage=false;
	boolean showNonStandardSizeQuote=false;
	boolean showNextSteps=true;
	boolean showBoxStorageOffer=false;
	boolean priceDifferencePerMonth;
	boolean allowSmallerQuote=true;
	boolean allowLargerQuote=true;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@JsonProperty("QuoteRef")
	public String getQuoteRef() {
		return "TOSTO"+Integer.toString(+quoteRef);
	}
	
	@JsonProperty("MainSize")
	public int getMainSize() {
		return mainSize;
	}
	public void setMainSize(int mainSize) {
		this.mainSize = mainSize;
	}
	@JsonProperty("MainFullPricePerMonth")
	public String getMainFullPricePerMonth() {
		return mainFullPricePerMonth;
	}
	public void setMainFullPricePerMonth(String mainFullPricePerMonth) {
		this.mainFullPricePerMonth = mainFullPricePerMonth;
	}
	@JsonProperty("MainFullPricePerWeek")
	public String getMainFullPricePerWeek() {
		return mainFullPricePerWeek;
	}
	public void setMainFullPricePerWeek(String mainFullPricePerWeek) {
		this.mainFullPricePerWeek = mainFullPricePerWeek;
	}
	
	@JsonProperty("MainDiscountedPricePerMonth")
	public String getMainDiscountedPricePerMonth() {
		return mainDiscountedPricePerMonth;
	}
	public void setMainDiscountedPricePerMonth(String mainDiscountedPricePerMonth) {
		this.mainDiscountedPricePerMonth = mainDiscountedPricePerMonth;
	}
	
	@JsonProperty("MainDiscountedPricePerWeek")
	public String getMainDiscountedPricePerWeek() {
		return mainDiscountedPricePerWeek;
	}
	public void setMainDiscountedPricePerWeek(String mainDiscountedPricePerWeek) {
		this.mainDiscountedPricePerWeek = mainDiscountedPricePerWeek;
	}
	
	@JsonProperty("MainDiscountPerMonthDescription")
	public String getMainDiscountPerMonthDescription() {
		return mainDiscountPerMonthDescription;
	}
	public void setMainDiscountPerMonthDescription(String mainDiscountPerMonthDescription) {
		this.mainDiscountPerMonthDescription = mainDiscountPerMonthDescription;
	}
	
	@JsonProperty("MainDiscountPerWeekDescription")
	public String getMainDiscountPerWeekDescription() {
		return mainDiscountPerWeekDescription;
	}
	public void setMainDiscountPerWeekDescription(String mainDiscountPerWeekDescription) {
		this.mainDiscountPerWeekDescription = mainDiscountPerWeekDescription;
	}
	
	@JsonProperty("UpgradePricePerWeek")
	public String getUpgradePricePerWeek() {
		return upgradePricePerWeek;
	}
	public void setUpgradePricePerWeek(String upgradePricePerWeek) {
		this.upgradePricePerWeek = upgradePricePerWeek;
	}
	
	@JsonProperty("ShowUpgradeOption")
	public boolean isShowUpgradeOption() {
		return showUpgradeOption;
	}
	public void setShowUpgradeOption(boolean showUpgradeOption) {
		this.showUpgradeOption = showUpgradeOption;
	}
	
	
	@JsonProperty("ShowNationalStorageMessage")
	public boolean isShowNationalStorageMessage() {
		return showNationalStorageMessage;
	}
	public void setShowNationalStorageMessage(boolean showNationalStorageMessage) {
		this.showNationalStorageMessage = showNationalStorageMessage;
	}

	@JsonProperty("ShowNonStandardSizeQuote")
	public boolean isShowNonStandardSizeQuote() {
		return showNonStandardSizeQuote;
	}
	public void setShowNonStandardSizeQuote(boolean showNonStandardSizeQuote) {
		this.showNonStandardSizeQuote = showNonStandardSizeQuote;
	}
	@JsonProperty("ShowNextSteps")
	public boolean isShowNextSteps() {
		return showNextSteps;
	}
	public void setShowNextSteps(boolean showNextSteps) {
		this.showNextSteps = showNextSteps;
	}
	
	@JsonProperty("ShowBoxStorageOffer")
	public boolean isShowBoxStorageOffer() {
		return showBoxStorageOffer;
	}
	public void setShowBoxStorageOffer(boolean showBoxStorageOffer) {
		this.showBoxStorageOffer = showBoxStorageOffer;
	}
	
	@JsonProperty("priceDifferencePerMonth")
	public boolean isPriceDifferencePerMonth() {
		return priceDifferencePerMonth;
	}
	public void setPriceDifferencePerMonth(boolean priceDifferencePerMonth) {
		this.priceDifferencePerMonth = priceDifferencePerMonth;
	}
	
	@JsonProperty("AllowSmallerQuote")
	public boolean isAllowSmallerQuote() {
		return allowSmallerQuote;
	}
	public void setAllowSmallerQuote(boolean allowSmallerQuote) {
		this.allowSmallerQuote = allowSmallerQuote;
	}
	
	@JsonProperty("AllowLargerQuote")
	public boolean isAllowLargerQuote() {
		return allowLargerQuote;
	}
	public void setAllowLargerQuote(boolean allowLargerQuote) {
		this.allowLargerQuote = allowLargerQuote;
	}

	@JsonProperty("ShowLimitedAvailability")
	public boolean isShowLimitedAvailability() {
		return showLimitedAvailability;
	}

	public void setShowLimitedAvailability(boolean showLimitedAvailability) {
		this.showLimitedAvailability = showLimitedAvailability;
	}

	@JsonProperty("UpgradeSize")
	public int getUpgradeSize() {
		return upgradeSize;
	}

	public void setUpgradeSize(int upgradeSize) {
		this.upgradeSize = upgradeSize;
	}
	
	
	
	
	
	
	
	
	
	

		
		  
		 

}
