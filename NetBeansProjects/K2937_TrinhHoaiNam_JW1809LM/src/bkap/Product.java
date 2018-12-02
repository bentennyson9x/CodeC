/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Lab06
 */
public class Product implements Iproduct,Serializable {

    private String productId;
    private String productName;
    private double importPrice;
    private double exportPrice;
    private double tax;
    private String color;
    private String description;
    private double profit;

    public Product() {
    }

    public Product(String productId, String productName, double importPrice, double exportPrice, double tax, String color, String description, double profit) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.tax = tax;
        this.color = color;
        this.description = description;
        this.profit = profit;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao ID: ");
        this.productId = in.nextLine();
        System.out.println("Nhap vao name: ");
        this.productName = in.nextLine();
        System.out.println("Nhap vao importPrice: ");
        this.importPrice = Double.parseDouble(in.nextLine());
        System.out.println("Nhap vao exportPrice: ");
        this.exportPrice = Double.parseDouble(in.nextLine());
        System.out.println("Nhap vao tax: ");
        this.tax = Double.parseDouble(in.nextLine());
        System.out.println("Nhap vao color: ");
        this.color = in.nextLine();
        System.out.println("Nhap vao description: ");
        this.description = in.nextLine();

    }

    public void tinhProfit() {
        this.profit = this.exportPrice - this.importPrice - this.tax;
    }

    @Override
    public void outputData() {
        System.out.println("ID: " + this.productId);
        System.out.println("Name: " + this.productName);
        System.out.println("Importprice: " + this.importPrice);
        System.out.println("Exportprice: " + this.exportPrice);
        System.out.println("Tax: " + this.tax);
        System.out.println("Color: " + this.color);
        System.out.println("Description: " + this.description);
        System.out.println("Profit: " + this.profit);
    }

}
