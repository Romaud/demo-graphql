package com.graphqldemo.query;

import com.graphqldemo.model.Vehicle;
import com.graphqldemo.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class VehicleMutation {
    private VehicleService vehicleService;

    @QueryMapping
    public Vehicle createVehicle(@Argument String type, String modelCode,
                                 @Argument String brandName,
                                 @Argument String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
