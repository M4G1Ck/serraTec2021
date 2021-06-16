package com.residencia.ecommerce.services;

import com.residencia.ecommerce.exceptions.ArquivosException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class ArquivosService {

    private Path localDoArquivo; //pra onde o arquivo vai

    @Value("${arquivos.imagem}")
    private String dirArquivosImagem; //local descrito no properties

    private void createDirectory() {
        //o local pra onde a foto vai, recebe o valor do local descrito no properties
        this.localDoArquivo = Paths.get(dirArquivosImagem)
                .toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.localDoArquivo);
        } catch (Exception e) {
            throw new ArquivosException("Nâo foi possível criar o diretório para armazenar o arquivo.", e);
        }

    }

    public String salvarImagem(MultipartFile imagem) {
        createDirectory();

        //Limpeza do nome?
        String fileName = StringUtils.cleanPath(imagem.getOriginalFilename());
        try {
            if (fileName.contains(".."))
                throw new ArquivosException("Nome de arquivo inválido!" + fileName);
            Path targetLocation = this.localDoArquivo.resolve(fileName);
            Files.copy(imagem.getInputStream(), targetLocation,
                    StandardCopyOption.REPLACE_EXISTING);

            return fileName;

        } catch (IOException e) {
            throw new ArquivosException("Ocorreu um erro e não foi possível armazenar o arquivo " + fileName, e);
        }
    }

    //copiado
    public boolean deleteFile(String file) {
        String fileName = StringUtils.cleanPath(file);

        try {
            if (fileName.contains("..")) {
                throw new ArquivosException("Desculpe, o nome do arquivo contém uma sequência de caminho inválida! " + fileName);
            }
            Path targetLocation = this.localDoArquivo.resolve(fileName);

            return Files.deleteIfExists(targetLocation);

        } catch (IOException ex) {
            throw new ArquivosException("O arquivo " + fileName + " não foi encontrado no servidor!", ex);
        }

    }
}
