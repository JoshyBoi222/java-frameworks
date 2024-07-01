package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (partRepository.count() == 0 && productRepository.count() == 0) {
            InhousePart part1= new InhousePart();
            part1.setName("CPU");
            part1.setPrice(300.00);
            part1.setInv(10);
            part1.setPartId(1001);
            part1.setMinInv(1);
            part1.setMaxInv(20);

            InhousePart part2 = new InhousePart();
            part2.setName("Motherboard");
            part2.setPrice(250.00);
            part2.setInv(20);
            part2.setPartId(1002);
            part2.setMinInv(10);
            part2.setMaxInv(30);

            InhousePart part3 = new InhousePart();
            part3.setName("RAM");
            part3.setPrice(200.00);
            part3.setInv(30);
            part3.setPartId(1003);
            part3.setMinInv(20);
            part3.setMaxInv(40);

            InhousePart part4 = new InhousePart();
            part4.setName("Storage");
            part4.setPrice(150.00);
            part4.setInv(40);
            part4.setPartId(1004);
            part4.setMinInv(30);
            part4.setMaxInv(50);

            InhousePart part5 = new InhousePart();
            part5.setName("GPU");
            part5.setPrice(100.00);
            part5.setInv(50);
            part5.setPartId(1005);
            part5.setMinInv(40);
            part5.setMaxInv(60);

            partRepository.save(part1);
            partRepository.save(part2);
            partRepository.save(part3);
            partRepository.save(part4);
            partRepository.save(part5);

            Product product1 = new Product("Work Station", 1600.00, 30);
            Product product2 = new Product("Desktop", 1400.00, 40);
            Product product3 = new Product("Laptop", 1800.00, 20);
            Product product4 = new Product("Gaming PC", 2000.00, 10);
            Product product5 = new Product("Smartphone", 1200.00, 50);

            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);
            productRepository.save(product4);
            productRepository.save(product5);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
