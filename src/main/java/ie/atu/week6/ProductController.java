package ie.atu.week6;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductServices myService;

    public ProductController(ProductServices myService) {
        this.myService = myService;
    }
    private List<Product> list = new ArrayList<>();
    // Creating a class which is interested in requests and responses
    @PostMapping
    public List<Product> newProduct(@RequestBody Product product)
    {
        // Send it to do business logic
        ProductServices myService = new ProductServices();
        list = myService.addProduct(product);
        return list;
    }
    @DeleteMapping
    public List<Product> removeProduct(@RequestBody Product product)
    {
        // Remove product by id
        ProductServices myService = new ProductServices();
        list = myService.removeProduct(product);
        return list;
    }

    @PutMapping
    public List<Product> updateProduct(@RequestBody Product product)
    {
        ProductServices myService = new ProductServices();
        list = myService.removeProduct(product);
        return list;
    }

    @GetMapping
    public List<Product> listProduct(Product product)
    {
        ProductServices myService = new ProductServices();
        list = myService.listProduct(product);
        return list;
    }
}
