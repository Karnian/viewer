package com.example.viewer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "view-api", url="${feign.view-api.url}")
public interface ViewClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ResponseBody
    String mainHome();

    @RequestMapping(method = RequestMethod.GET, value = "/{status}")
    @ResponseBody
    String contributors(
            @RequestParam("status") String status
    );

    @RequestMapping(method = RequestMethod.GET, value = "/{status}/{id}")
    @ResponseBody
    String contributors_id(
            @RequestParam("status") String status,
            @RequestParam("id") String id
    );
}
