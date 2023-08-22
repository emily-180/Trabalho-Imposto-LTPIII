import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculate calculo = new Calculate();
        List<Tax> model1 = new ArrayList<>();
        model1.add(new ICMS());
        model1.add(new Confins());
        model1.add(new ISS());
        
        List<Tax> model2 = new ArrayList<>();
        model2.add(new ICMS());
        model2.add(new Confins());
        model2.add(new IPI());
        
        List<Tax> model3 = new ArrayList<>();
        model3.add(new ICMS());
        model3.add(new Confins());
        model3.add(new ISS());
        model3.add(new IPI());
        
        List<Tax> model4 = new ArrayList<>();
        model4.add(new ICMS());
        model4.add(new Confins());
        model4.add(new Cide());
        
        List<Product> products = new ArrayList<>();
        products.add(new Product("Arroz", 7.00, model1, 0.20));
        products.add(new Product("Feijão",7.00, model1, 0.25));
        products.add(new Product("Carne",7.00, model2, 0.35));
        products.add(new Product("Cerveja",7.00, model3, 0.30));
        products.add(new Product("Gás",7.00, model2, 0.15));
        products.add(new Product("Gasolina",7.00, model4, 0.15));
        
        System.out.println("****PREÇO FINAL DOS PRODUTOS****");
        System.out.println("");
        for (Product product : products) {
            double finalPrince = calculo.salePrice(product);
            System.out.printf("%s --> R$%.2f%n", product.getNameProduct(), finalPrince);
            
            List<Tax> productTaxes = product.getTaxes();
            for (Tax tax : productTaxes) {
                System.out.printf("Imposto: %s, ", tax.getName());
            }
            System.out.println("\n");  
            
        }
    } 
}
