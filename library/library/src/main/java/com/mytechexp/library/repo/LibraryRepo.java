package com.mytechexp.library.repo;

import com.mytechexp.library.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository <Library,Long>{
}
