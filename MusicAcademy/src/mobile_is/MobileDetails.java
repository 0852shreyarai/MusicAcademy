/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobile_is;

/**
 * Class MobileDetails maintains the information of device in the system
 */
public class MobileDetails {
    private String modelNumber;
    private String name;
    private String category;
    private String processor;
    private String memory;
    private String colour;
    private int price;

    // Default constructor of the class MobileDetails
    public MobileDetails() {
    }

        // Constructor of the class MobileDetails with all parameters
    public MobileDetails(String modelNumber, String name, String category, String processor, String memory, String colour, int price) {
        this.modelNumber = modelNumber;
        this.name = name;
        this.category = category;
        this.processor = processor;
        this.memory = memory;
        this.colour = colour;
        this.price = price;
    }

    // modelNumber getter method
    public String getModelNumber() {
        return modelNumber;
    }

    // name getter method
    public String getName() {
        return name;
    }

    // category getter method
    public String getCategory() {
        return category;
    }

    // processor getter method
    public String getProcessor() {
        return processor;
    }

    // memory getter method
    public String getMemory() {
        return memory;
    }

    // colour getter method
    public String getColour() {
        return colour;
    }

    // price getter method
    public int getPrice() {
        return price;
    }

    // modelNumber setter method
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    // name setter method
    public void setName(String name) {
        this.name = name;
    }

    // category setter method
    public void setCategory(String category) {
        this.category = category;
    }

    // processor setter method
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // memory setter method
    public void setMemory(String memory) {
        this.memory = memory;
    }

    // colour setter method
    public void setColour(String colour) {
        this.colour = colour;
    }

    // price setter method
    public void setPrice(int price) {
        this.price = price;
    }
    
    // method to compare mobile details for price with another mobile details
    public int compareTo(MobileDetails mobile) {
        int response = 0;
        if (this.price < mobile.getPrice()) {
            response =- 1;
        }
        if (this.price > mobile.getPrice()) {
            response = 1;
        }
        return response;
    }
    
    // method to copy the mobile details to new object
    public MobileDetails copyMobileDetails(){
        return new MobileDetails(this.modelNumber, this.name, this.category, this.processor, this.memory, this.colour, this.price);
    }
}
