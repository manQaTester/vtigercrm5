package org.eva.vtigercrm5.pages.inventory.productsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class InventoryProductsNewCreatProductFormOr {
	
	public InventoryProductsNewCreatProductFormOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this);
	}

	@FindBy(xpath="//input[@name='productname']")
	private WebElement productNameTB;
	
	@FindBy(xpath="//input[@name='productcode']")
	private WebElement partNumberTB;
	
	@FindBy(xpath="//input[@name='sales_start_date']")
	private WebElement salesStartDate;
	
	@FindBy(xpath="//select[@name='manufacturer']")
	private WebElement ManufactureDD;
	
	@FindBy(xpath="//select[@name='productcategory']")
	private WebElement productCategryDD;
	
	 @FindBy(xpath="//input[@name='start_date']")
	  private WebElement start_dateTB;
	  
	  @FindBy(xpath="//input[@name='sales_end_date']")
	  private WebElement start_EndTB;
	  
	  @FindBy(xpath="//input[@name='expiry_date']")
	  private WebElement expiry_dateTB;
	  
	  @FindBy(xpath="//input[@name='website']")
	  private WebElement websiteTB;
	  
	  @FindBy(xpath="//input[@name='vendor_part_no']")
	  private WebElement vendor_part_noTB;
	  
	  @FindBy(xpath="//input[@name='productsheet']")
	  private WebElement productsheetTB;
	  
	  @FindBy(xpath="//input[@name='serial_no']")
	  private WebElement serial_noTB;
	  
	  @FindBy(xpath="//input[@name='unit_price']")
	  private WebElement unit_priceTB;
	  
	  @FindBy(xpath="//input[@name='commissionrate']")
	  private WebElement commissionrateTB;
	  
	  @FindBy(xpath="//input[@name='tax1_check']")
	  private WebElement tax1_checkTB;
	  
	  @FindBy(xpath="//input[@name='tax2_check']")
	  private WebElement tax2_checkTB; 
	  
	  @FindBy(xpath="//input[@name='tax3_check']")
	  private WebElement tax3_checkTB;
	  
	  @FindBy(xpath="//textarea[@name='description']")
	  private WebElement descriptionTB;
	   
}
