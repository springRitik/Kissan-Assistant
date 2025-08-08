package com.kissan.assistant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kissan.assistant.entity.Kissan;
@Repository
public interface KissanRepository extends JpaRepository<Kissan, Long>{

}
