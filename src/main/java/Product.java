import java.util.List;

public class Product {

    enum prodType {
        Product,Service
    }

    private Integer id;
    private prodType productType;
    private String productCode;
    private String vendorProductCode;
    private String productName;
    private String productDescription;
    private Integer availableQuantity;
    private String availableQuantityUnit;
    private String unitPrice;
    private Integer vatRate;
    private Integer deliveryTimeInDays;
    private Integer doorToDoor;
    private Integer selfPickup;
    private Integer postalPackage;
    private String warehouseLocation;
    private String tenderRefNr;
    private String cpvCode;
    private List<Pictures> pictures;

    public Product(Integer id, String productType, String productCode, String vendorProductCode,
                   String productName, String productDescription, Integer availableQuantity,
                   String availableQuantityUnit, String unitPrice, Integer vatRate, Integer deliveryTimeInDays,
                   Integer doorToDoor, Integer selfPickup, Integer postalPackage, String warehouseLocation,
                   String tenderRefNr, String cpvCode, List<Pictures> pictures) {
        this.id = id;
        this.productType = prodType.Product;
        this.productCode = productCode;
        this.vendorProductCode = vendorProductCode;
        this.productName = productName;
        this.productDescription = productDescription;
        this.availableQuantity = availableQuantity;
        this.availableQuantityUnit = availableQuantityUnit;
        this.unitPrice = unitPrice;
        this.vatRate = vatRate;
        this.deliveryTimeInDays = deliveryTimeInDays;
        this.doorToDoor = doorToDoor;
        this.selfPickup = selfPickup;
        this.postalPackage = postalPackage;
        this.warehouseLocation = warehouseLocation;
        this.tenderRefNr = tenderRefNr;
        this.cpvCode = cpvCode;
        this.pictures = pictures;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public prodType getProductType() {
        return productType;
    }

    public void setProductType(prodType productType) {
        this.productType = productType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getVendorProductCode() {
        return vendorProductCode;
    }

    public void setVendorProductCode(String vendorProductCode) {
        this.vendorProductCode = vendorProductCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getAvailableQuantityUnit() {
        return availableQuantityUnit;
    }

    public void setAvailableQuantityUnit(String availableQuantityUnit) {
        this.availableQuantityUnit = availableQuantityUnit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getVatRate() {
        return vatRate;
    }

    public void setVatRate(Integer vatRate) {
        this.vatRate = vatRate;
    }

    public Integer getDeliveryTimeInDays() {
        return deliveryTimeInDays;
    }

    public void setDeliveryTimeInDays(Integer deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    public Integer getDoorToDoor() {
        return doorToDoor;
    }

    public void setDoorToDoor(Integer doorToDoor) {
        this.doorToDoor = doorToDoor;
    }

    public Integer getSelfPickup() {
        return selfPickup;
    }

    public void setSelfPickup(Integer selfPickup) {
        this.selfPickup = selfPickup;
    }

    public Integer getPostalPackage() {
        return postalPackage;
    }

    public void setPostalPackage(Integer postalPackage) {
        this.postalPackage = postalPackage;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public String getTenderRefNr() {
        return tenderRefNr;
    }

    public void setTenderRefNr(String tenderRefNr) {
        this.tenderRefNr = tenderRefNr;
    }

    public String getCpvCode() {
        return cpvCode;
    }

    public void setCpvCode(String cpvCode) {
        this.cpvCode = cpvCode;
    }

    public List<Pictures> getPictures() {
        return pictures;
    }

    public void setPictures(List<Pictures> pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
