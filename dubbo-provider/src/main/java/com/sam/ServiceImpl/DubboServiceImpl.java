package com.sam.ServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sam.service.DubboService;

@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String getString() {
        return "DubboTest is successful.";
    }
}
