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

	public double getCostPrice() {
		return costPrice;
	}

	public List<Tax> getTaxes() {
		return taxes;
	}

	public double getProfitMargin() {
		return profitMargin;
	}
    
    
}
