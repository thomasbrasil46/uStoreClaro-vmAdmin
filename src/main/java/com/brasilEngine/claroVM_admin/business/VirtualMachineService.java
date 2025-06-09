package com.brasilEngine.claroVM_admin.business;

import com.brasilEngine.claroVM_admin.infrastructure.entitys.VirtualMachine;
import com.brasilEngine.claroVM_admin.infrastructure.repository.VirtualMachineRepository;
import org.springframework.stereotype.Service;

@Service
public class VirtualMachineService {

    private final VirtualMachineRepository repository;


    public VirtualMachineService(VirtualMachineRepository repository) {
        this.repository = repository;
    }

    public void createVirtualMachine(VirtualMachine virtualMachine) {
        repository.saveAndFlush(virtualMachine);
    }

    public VirtualMachine findVirtualMachineById(Integer id) {

        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Id não encontrado.")
        );
    }

    public void deleteVirtualMachineById(Integer id) {
        repository.deleteById(id);
    }

    public VirtualMachine updateById(Integer id, VirtualMachine virtualMachine){
        VirtualMachine virtualMachineEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Id não encontrado."));

                if (virtualMachine.getNome() != null) {
                    virtualMachineEntity.setNome(virtualMachine.getNome());
                }

                if (virtualMachine.getMemoria() != null){
                    virtualMachineEntity.setMemoria(virtualMachine.getMemoria());
                }

                if (virtualMachine.getCpu() != null) {
                    virtualMachineEntity.setCpu(virtualMachine.getCpu());
                }

                if (virtualMachine.getDisco() != null){
                    virtualMachineEntity.setDisco(virtualMachine.getDisco());
                }

                return repository.saveAndFlush(virtualMachineEntity);
    }
}
