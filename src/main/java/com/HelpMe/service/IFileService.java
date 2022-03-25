package com.HelpMe.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {

    public void init();

    public void save(MultipartFile File);

    public Resource load(String filename);
    
    public void deleteAll();

    public Stream<Path> loadAll();
    
    public String deleteFile(String filename);
}
