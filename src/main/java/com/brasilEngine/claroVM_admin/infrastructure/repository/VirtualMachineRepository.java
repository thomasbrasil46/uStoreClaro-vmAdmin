package com.brasilEngine.claroVM_admin.infrastructure.repository;

import com.brasilEngine.claroVM_admin.infrastructure.entitys.VirtualMachine;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VirtualMachineRepository extends JpaRepository<VirtualMachine, Integer> {

    Optional<VirtualMachine> findById(Integer id);

    @Transactional
    void deleteById(Integer id);
}
