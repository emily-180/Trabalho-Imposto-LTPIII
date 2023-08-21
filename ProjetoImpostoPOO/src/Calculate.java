public class Calculate {
    public double salePrice(Product product) {
        return product.getCostPrice() + sumTaxes(product) + (product.getCostPrice() * product.getProfitMargin());
    }

    public double sumTaxes(Product product) {
        double totalTax = 0;
        for (Tax tax : product.getTaxes()) {
            totalTax += product.getCostPrice() * tax.getNumber();
        }
        return totalTax;
    }
}
