package com.ijse.cropinventoryservice.controller;

import com.ijse.cropinventoryservice.entity.Crop;
import com.ijse.cropinventoryservice.entity.CropState;
import com.ijse.cropinventoryservice.service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crops")
public class CropController {

    @Autowired
    private CropService cropService;

    // POST /api/crops: Add a new crop
    @PostMapping
    public ResponseEntity<Crop> addCrop(@RequestBody Crop crop) {
        return ResponseEntity.ok(cropService.addCrop(crop));
    }

    // GET /api/crops: List all crops
    @GetMapping
    public ResponseEntity<List<Crop>> getAllCrops() {
        return ResponseEntity.ok(cropService.getAllCrops());
    }

    // PATCH /api/crops/{id}/state: Update only the crop state
    @PatchMapping("/{id}/state")
    public ResponseEntity<Crop> updateState(
            @PathVariable String id,
            @RequestParam CropState state) {
        return ResponseEntity.ok(cropService.updateCropState(id, state));
    }

    // DELETE /api/crops/{id}: Remove a crop record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCrop(@PathVariable String id) {
        cropService.deleteCrop(id);
        return ResponseEntity.ok().build();
    }
}