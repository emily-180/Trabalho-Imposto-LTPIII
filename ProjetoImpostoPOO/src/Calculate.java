public class Calculate {
    public double salePrice(Product product) {
        double sum = product.getCostPrice() + sumTaxes(product);
        double lucro = (sum * product.getProfitMargin());
        return lucro+ sum;
    }

    public double sumTaxes(Product product) {
        double totalTax = 0;
        for (Tax tax : product.getTaxes()) {
            totalTax += product.getCostPrice() * tax.getNumber();
        }
        return totalTax;
    }
}