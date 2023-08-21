import java.util.List;

public class Product {
    private String nameProduct;
    private double costPrice; //preco custo
    private List<Tax> taxes; 
    private double profitMargin; //margem lucro

    public Product(String nameProduct, double costPrice, List<Tax> impostos, double profitMargin) {
        this.nameProduct = nameProduct;
        this.costPrice = costPrice;
        this.taxes = impostos;
        this.profitMargin = profitMargin;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    
    public double sumTaxes() {
        double totalTax = 0;
        for (Tax tax : taxes) {
            totalTax += costPrice * tax.getNumber();
        }
        return totalTax;
    }

    public double salePrice() {
        return costPrice + sumTaxes() + (costPrice * profitMargin);
    }
}
