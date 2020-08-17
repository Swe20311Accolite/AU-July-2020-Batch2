import com.sun.istack.internal.NotNull;

import java.util.*;
import java.util.stream.Collectors;
class Products {
    private String name;
    private int category, price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
class ProductFactory {
    public List<Products> getListOfProducts(int numberOfProducts) {
        List<Products> p = new ArrayList<>();
        for (int i = 1; i <= numberOfProducts; i++) {
            p.add(createProduct(i));
        }
        return p;
    }
    private Products createProduct(int i) {
        Products p = new Products();
        p.setName("Product"+i);
        p.setCategory((int)(Math.random()*(30-5+1)+1));
        p.setPrice((int)(Math.random()*(500-100+1)+1));
        return p;
    }
}

}

public class Streamapi3 {
        public static List<Products> Range(@NotNull List<Products> p, int x, int y) {
            return p.stream().filter(product-> product.getPrice()>=x && product.getPrice()<=y).collect(Collectors.toList());
        }
        public static int Categories(List<Products> p) {
            return p.stream().map(Products::getCategory).collect(Collectors.toSet()).size();
        }
        public static void max_min_perCategory(List<Products> p) {
            Set<Integer> Category = p.stream().map(Products::getCategory).collect(Collectors.toSet());
            for (Integer c: Category) {
                int maximum = p.stream().filter(product -> product.getCategory() == c).map(Products::getPrice).max(Comparator.comparing(Integer::intValue)).get();
                int minimum = p.stream().filter(product -> product.getCategory() == c).map(Products::getPrice).min(Comparator.comparing(Integer::intValue)).get();
                System.out.println(maximum+"price belongs to "+c+" category");
                System.out.println("maximum price products");
                List<Products> maxProducts = p.stream().filter(product -> product.getPrice()==maximum).collect(Collectors.toList());
                maxProducts.forEach(product -> System.out.println(product.getName()));
                System.out.println(minimum+"price belongs to "+c+" category");
                System.out.println("The Products with the minimum price are:");
                List<Products> minProducts = p.stream().filter(product -> product.getPrice()==minimum).collect(Collectors.toList());
                minProducts.forEach(product -> System.out.println(product.getName()));
            }
        }
        public static void main(String []args) {
            ProductFactory pf = new ProductFactory();
            List<Products> p = pf.getListOfProducts(40);
            max_min_perCategory(p);
            List<Products> productsWithinPriceRange = Range(p, 100, 300);
            for (Products product : productsWithinPriceRange) {
                System.out.println(product.getName());
            }
            System.out.println("Total Categories Present: " + Categories(p));
        }
    }
