package com.mytechexp.library.controller;

import com.mytechexp.library.entity.Library;
import com.mytechexp.library.service.LibraryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/library")
@Log4j2
public class LibraryController {
    @Autowired
    private LibraryService libService;
    @PostMapping("/create")
    public Library createLibrary(@RequestBody Library library)
    {
        log.info("inside create controller");
       libService.createLibrary(library);
       log.info("executed the createLibrary");
        return library;
    }
    @GetMapping("/{id}")
    public Library searchLibrary(@PathVariable long id)
    {
        Optional<Library> lib=libService.findbyId(id);
        if(lib.isPresent())
           return lib.get();
        else
        return null;
    }

}
