package com.blackoperations.treadstone.repository;

import com.blackoperations.treadstone.domain.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, Long> {
}
