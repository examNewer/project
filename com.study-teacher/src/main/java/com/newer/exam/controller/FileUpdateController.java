package com.newer.exam.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;


@RestController("FileUpdateController")
@RequestMapping(value = "/api")
public class FileUpdateController {
	@Autowired
	private FastFileStorageClient storageClient;


	// 处理文件上传
	@RequestMapping(value="/upload")
	public String upload(MultipartFile img,HttpSession session) throws Exception{
		String fileName=img.getOriginalFilename();
		String extName=fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(extName);
		StorePath storePath =storageClient.uploadFile((InputStream)img.getInputStream(), img.getSize(), extName, null);
		System.out.println(storePath);
		return storePath.getFullPath();
	}
}
