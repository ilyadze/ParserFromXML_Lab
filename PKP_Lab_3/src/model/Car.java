package model;


public class Car {
    private Integer enginePower;
    private String bodyType;
    private String color;
    private String manufacture;

    private String model;
    private Double price;

    private Integer yearOfIssue;


    private static final String CARD_NUMBER_PATTERN = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
    private static final String CARD_HOLDER_PATTERN = "[A-Za-z\\s]+";
    private static final String EXPIRATION_DATE_PATTERN = "\\d{4}-\\d{2}";
    private static final String CVC_PATTERN = "\\d{3}";






    public Car() {}

    public Car(Integer enginePower, String bodyType, String color, String manufacture, String model, Double price, Integer yearOfIssue) {
        this.enginePower = enginePower;
        this.bodyType = bodyType;
        this.color = color;
        this.manufacture = manufacture;
        this.model = model;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "enginePower=" + enginePower +
                ", bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
