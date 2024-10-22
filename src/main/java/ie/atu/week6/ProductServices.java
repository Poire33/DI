package ie.atu.week6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {
    private List<Product> myList = new ArrayList<>();

    public List<Product> addProduct(Product product)
    {
        // Do business stuff like retrieving details from database, or generating files pdfs
        myList.add(product);
        return myList;
    }

    public List<Product> removeProduct(Product product)
    {
        myList.remove(product);
        return myList;
    }

    public List<Product> updateProduct(Product product)
    {
        myList.remove(product);
        myList.add(product);
        return myList;
    }

    public List<Product> listProduct(Product product)
    {
        return myList;
    }
}
