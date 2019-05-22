package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.falsedomain.AvarageMark;
import com.example.sweater.domain.falsedomain.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name,Long> {

}
