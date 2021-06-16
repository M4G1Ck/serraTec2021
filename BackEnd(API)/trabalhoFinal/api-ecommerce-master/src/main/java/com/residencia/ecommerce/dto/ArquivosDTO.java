package com.residencia.ecommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArquivosDTO {

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
    //public ArquivosVO(String fileName, String fileDownloadUri, String fileType, long size)


}
