package com.MMT.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Flights']")
	private WebElement FlightModuleBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Hotels']")
	private WebElement hotelModuleBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Homestays & Villas']")
	private WebElement HomestayVillasBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Holiday Packages']")
	private WebElement holidaysPackageBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Trains']")
	private WebElement trainsBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Buses']")
	private WebElement busesBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Cabs']")
	private WebElement CabsBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Forex Card & Currency']")
	private WebElement forexCardCurrancyBtn;
	
	@FindBy(xpath = "//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Travel Insurance']")
	private WebElement travelInsuranceBtn;
	
	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	private WebElement popupCancelBtn;
	
	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFlightModuleBtn() {
		return FlightModuleBtn;
	}

	public WebElement getHotelModuleBtn() {
		return hotelModuleBtn;
	}

	public WebElement getHomestayVillasBtn() {
		return HomestayVillasBtn;
	}

	public WebElement getHolidaysPackageBtn() {
		return holidaysPackageBtn;
	}

	public WebElement getTrainsBtn() {
		return trainsBtn;
	}

	public WebElement getBusesBtn() {
		return busesBtn;
	}

	public WebElement getCabsBtn() {
		return CabsBtn;
	}

	public WebElement getForexCardCurrancyBtn() {
		return forexCardCurrancyBtn;
	}

	public WebElement getTravelInsuranceBtn() {
		return travelInsuranceBtn;
	}

	public WebElement getPopupCancelBtn() {
		return popupCancelBtn;
	}
	
	//business Logic
	
	public void clickOnFlights()
	{
		FlightModuleBtn.click();
	}
	public void clickOnHotels()
	{
		hotelModuleBtn.click();
	}
	public void clickOnHolidaysNPackages()
	{
		holidaysPackageBtn.click();
	}
	public void clickOnTrain()
	{
		trainsBtn.click();
	}
	public void clickOnBuses()
	{
		busesBtn.click();
	}
	public void clickOnforexCardCurrancy()
	{
		forexCardCurrancyBtn.click();
	}
	public void clickOnTravelInsurance()
	{
		travelInsuranceBtn.click();
	}
	public void clickOnPopUp()
	{
		popupCancelBtn.click();
	}
	

}
