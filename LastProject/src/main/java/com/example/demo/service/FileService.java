package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FileModel;
import com.example.demo.repository.FileRepository;

@Service
public class FileService {
 
	@Autowired
	private FileRepository fileRepository;

	public void addFile(FileModel fileModel) {
		fileRepository.save(fileModel);
		
	}
}
