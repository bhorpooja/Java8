package com.example.Java8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by pooja on 23/9/17.
 */
class Product{
    int p_id;
    String p_name;
    int p_price;
    Product(int p_id,String p_name,int p_price){
        super();
        this.p_id=p_id;
        this.p_name=p_name;
        this.p_price=p_price;
    }
}
public class FilterCollectionExample {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();

        //adding products
        list.add(new Product(1,"Iphone",20000));
        list.add(new Product(2,"Redmi",35000));
        list.add(new Product(3,"Vivo",10000));

        //use lambda stream filter to filtered data
        Stream<Product> filter_data=list.stream().filter(p -> p.p_price>10000 );
        filter_data.forEach(p -> System.out.println(p.p_id+" : "+p.p_name+" : "+p.p_price));
    }
}
