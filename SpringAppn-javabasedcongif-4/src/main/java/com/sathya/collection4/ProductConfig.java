package com.sathya.collection4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProductConfig {

    @Bean
    public MarignBean id1() {
        MarignBean marignBean = new MarignBean();
        marignBean.setMarginId(10021);
        marignBean.setMarginCode("ABCD");
        return marignBean;
    }

    @Bean
    public ModelBean id2(MarignBean id1) {
        ModelBean modelBean = new ModelBean();
        modelBean.setModelId(3124);
        modelBean.setModelCode("Ayfr");
        modelBean.setModelPrice(564.0);

        Map<String, MarignBean> marginMap = new HashMap<>();
        marginMap.put("id1", id1);

        modelBean.setMarginmgOb(marginMap);
        return modelBean;
    }

    @Bean
    public ProductBean id3(ModelBean id2) {
        ProductBean productBean = new ProductBean();
        productBean.setProductId(3241);
        productBean.setProductName("choco");
        productBean.setModelObjs(Arrays.asList(id2));
        return productBean;
    }
}
