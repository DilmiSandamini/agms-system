package com.ijse.zoneservice.client;

import com.ijse.zoneservice.dto.DeviceRequest;
import com.ijse.zoneservice.dto.DeviceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "external-iot-service", url = "http://104.211.95.241:8080/api")
public interface IotDeviceClient {

    @PostMapping("/devices")
    DeviceResponse registerDevice(
            @RequestHeader("Authorization") String token,
            @RequestBody DeviceRequest request
    );
}