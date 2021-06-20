package com.mytechexp.library.service;

import com.mytechexp.library.entity.Library;
import com.mytechexp.library.repo.LibraryRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class LibraryService {
    @Autowired
    private LibraryRepo libRepo;
    public Library createLibrary(Library lib)
    {
        log.info("entering to createLibrary Service");
        return libRepo.save(lib);
    }


    public Optional<Library> findbyId(long id) {
        return libRepo.findById(id);
    }
}
