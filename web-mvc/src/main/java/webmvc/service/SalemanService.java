package webmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webmvc.entity.BeeSalemanInfo;
import webmvc.mapper.BeeSalemanInfoMapper;

@Service
public class SalemanService {
    @Autowired(required = false)
    private BeeSalemanInfoMapper beeSalemanInfoMapper;

    public int insertSalemanInfo(){
        BeeSalemanInfo beeSalemanInfo=new BeeSalemanInfo();
        beeSalemanInfo.setId(Long.valueOf("327523849"));
        beeSalemanInfo.setInviteCode("dgfdg");
        beeSalemanInfo.setSalemanName("glkhsg");
        beeSalemanInfo.setSalemanNum("dffhgs");
        beeSalemanInfo.setMerchantNum("cvnbm");
        return beeSalemanInfoMapper.insertSelective(beeSalemanInfo);

    }


}
