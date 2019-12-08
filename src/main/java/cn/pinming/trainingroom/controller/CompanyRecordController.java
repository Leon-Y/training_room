package cn.pinming.trainingroom.controller;

import cn.pinming.trainingroom.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Date: 2019/12/8 :11:18
 * @Description:
 */
@RequestMapping("/zhgd/company")
@RestController
public class CompanyRecordController {

    @PostMapping("/monthlyStatistics")
    public ResponseEntity monthlyStatistics(@RequestParam("coId") String companyId){


        return ResponseEntity.ok(new SuccessResponse(null));
    }
}
