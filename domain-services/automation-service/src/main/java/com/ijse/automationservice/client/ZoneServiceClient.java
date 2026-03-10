package com.ijse.automationservice.client;

import com.ijse.automationservice.dto.ZoneDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zone-service")
public interface ZoneServiceClient {

    @GetMapping("/api/zones/{id}")
    ZoneDTO getZoneById(@PathVariable("id") String id);
}