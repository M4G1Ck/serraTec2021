package com.residencia.ecommerce.services;

import com.residencia.ecommerce.dto.CadastroCliente;
import com.residencia.ecommerce.dto.LoginCliente;
import com.residencia.ecommerce.entities.Cliente;
import com.residencia.ecommerce.entities.Endereco;
import com.residencia.ecommerce.repositories.ClienteRepository;
import com.residencia.ecommerce.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired EnderecoService enderecoService;

    //Cadastro cliente
    public CadastroCliente cadastro (CadastroCliente cadastroCliente) {

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();

        //Endereço
        endereco.setCep(cadastroCliente.getCep());
        endereco.setRua(cadastroCliente.getRua());
        endereco.setBairro(cadastroCliente.getBairro());
        endereco.setCidade(cadastroCliente.getCidade());
        endereco.setEstado(cadastroCliente.getEstado());
        endereco.setNumero(cadastroCliente.getNumero());
        endereco.setComplemento(cadastroCliente.getComplemento());
        enderecoRepository.save(endereco);
        cadastroCliente.setIdEndereco(endereco.getId_Endereco());
        //Cliente
        cliente.setEmail(cadastroCliente.getEmail());
        cliente.setUsername(cadastroCliente.getUsername());
        cliente.setSenha(cadastroCliente.getSenha());
        cliente.setNome(cadastroCliente.getNome());
        cliente.setCpf(cadastroCliente.getCpf());
        cliente.setTelefone(cadastroCliente.getTelefone());
        cliente.setDataNascimento(cadastroCliente.getDataNascimento());
        cliente.setIdEndereco(enderecoRepository.getById(endereco.getId_Endereco()));
        clienteRepository.save(cliente);
        cadastroCliente.setIdCliente(cliente.getIdCliente());
        return cadastroCliente;
    }

    //Atualizar cliente
    public Cliente update (CadastroCliente cadastroCliente, Integer id) {

        Cliente cliente = clienteRepository.getById(id);
        Endereco endereco = enderecoRepository.getById(cliente.getIdEndereco().getId_Endereco());

        //Endereço
        endereco.setCep(cadastroCliente.getCep());
        endereco.setRua(cadastroCliente.getRua());
        endereco.setBairro(cadastroCliente.getBairro());
        endereco.setCidade(cadastroCliente.getCidade());
        endereco.setEstado(cadastroCliente.getEstado());
        endereco.setNumero(cadastroCliente.getNumero());
        endereco.setComplemento(cadastroCliente.getComplemento());
        enderecoRepository.save(endereco);
        //Cliente
        cliente.setEmail(cadastroCliente.getEmail());
        cliente.setUsername(cadastroCliente.getUsername());
        cliente.setSenha(cadastroCliente.getSenha());
        cliente.setNome(cadastroCliente.getNome());
        //cliente.setCpf(cadastroCliente.getCpf());
        cliente.setTelefone(cadastroCliente.getTelefone());
        cliente.setDataNascimento(cadastroCliente.getDataNascimento());
        clienteRepository.save(cliente);

        return cliente;
    }

    //Deletar cliente
    public boolean delete (Integer id) {
        if (id != null) {

            Integer idEndereco = clienteRepository.getById(id).getIdEndereco().getId_Endereco();
            clienteRepository.deleteById(id);
            enderecoRepository.deleteById(idEndereco);
            return true;
        }
        else {
            return false;
        }
    }

    //Login cliente
    public Cliente checaEmail (LoginCliente login){
       return clienteRepository.findByEmail(login.getEmail());
    }
}
