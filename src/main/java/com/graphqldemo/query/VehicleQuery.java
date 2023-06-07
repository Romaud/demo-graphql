package com.graphqldemo.query;

import com.graphqldemo.model.Vehicle;
import com.graphqldemo.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class VehicleQuery{
    private VehicleService vehicleService;

    @QueryMapping
    public List<Vehicle> getVehicles(@Argument int count) {
        System.out.println(count);
        System.out.println(count);
        return this.vehicleService.getAllVehicles(count);
    }

    @QueryMapping
    public Optional<Vehicle> getVehicle(@Argument int id) {
        System.out.println(id);
        System.out.println(id);
        System.out.println(id);
        System.out.println(id);
        return this.vehicleService.getVehicle(id);
    }
}
