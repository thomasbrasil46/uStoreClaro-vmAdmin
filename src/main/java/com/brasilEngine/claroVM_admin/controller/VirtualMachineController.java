package com.brasilEngine.claroVM_admin.controller;

import com.brasilEngine.claroVM_admin.business.VirtualMachineService;
import com.brasilEngine.claroVM_admin.infrastructure.entitys.VirtualMachine;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/virtualMachine")
@RequiredArgsConstructor
public class VirtualMachineController {

    private final VirtualMachineService virtualMachineService;

    @PostMapping
    @Operation(description = "Cria nova VM.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Criação realizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar criação.")
    })
    public ResponseEntity<Void> createVirtualMachine(@Valid @RequestBody VirtualMachine virtualMachine){
        virtualMachineService.createVirtualMachine(virtualMachine);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    @Operation(description = "Busca VM por Id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca de dados.")
    })
    public ResponseEntity<VirtualMachine> getVirtualMachineById(@RequestParam Integer id) {
        return ResponseEntity.ok(virtualMachineService.findVirtualMachineById(id));
    }

    @DeleteMapping("/{id}")
    @Operation(description = "Deleta VM por Id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleção realizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar deleção.")
    })
    public ResponseEntity<Void> deleteVirtualMachineById(@RequestParam Integer id) {
        virtualMachineService.deleteVirtualMachineById(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping
    @Operation(description = "Atualiza VM parcialmente.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Atualização realizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar atualização.")
    })
    public ResponseEntity<Void> updateVirtualMachineById(@RequestParam Integer id,
                                                         @RequestBody VirtualMachine virtualMachine) {
        virtualMachineService.updateById(id, virtualMachine);
        return ResponseEntity.ok().build();
    }
}
