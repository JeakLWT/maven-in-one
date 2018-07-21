package webmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webmvc.entity.BeeSalemanInfo;
import webmvc.mapper.BeeSalemanInfoMapper;
import webmvc.service.SalemanService;

@RestController
public class MapperController {

    @Autowired
    private SalemanService salemanService;
    @RequestMapping("/insertSalemanInfo")
    public int insertSalemanInfo(){
      return   salemanService.insertSalemanInfo();

    }

}
