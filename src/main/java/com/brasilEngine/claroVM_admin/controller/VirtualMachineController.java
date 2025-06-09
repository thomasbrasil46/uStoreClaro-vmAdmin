package com.brasilEngine.claroVM_admin.controller;

import com.brasilEngine.claroVM_admin.business.VirtualMachineService;
import com.brasilEngine.claroVM_admin.infrastructure.entitys.VirtualMachine;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/virtualMachine")
@RequiredArgsConstructor
public class VirtualMachineController {

    private final VirtualMachineService virtualMachineService;

    @PostMapping
    public ResponseEntity<Void> createVirtualMachine(@RequestBody VirtualMachine virtualMachine){
        virtualMachineService.createVirtualMachine(virtualMachine);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<VirtualMachine> getVirtualMachineById(@RequestParam Integer id) {
        return ResponseEntity.ok(virtualMachineService.findVirtualMachineById(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteVirtualMachineById(@RequestParam Integer id) {
        virtualMachineService.deleteVirtualMachineById(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping
    public ResponseEntity<Void> updateVirtualMachineById(@RequestParam Integer id,
                                                         @RequestBody VirtualMachine virtualMachine) {
        virtualMachineService.updateById(id, virtualMachine);
        return ResponseEntity.ok().build();
    }
}
