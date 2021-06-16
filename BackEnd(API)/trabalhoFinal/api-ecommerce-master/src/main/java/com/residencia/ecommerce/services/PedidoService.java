package com.residencia.ecommerce.services;

import com.residencia.ecommerce.dto.*;
import com.residencia.ecommerce.entities.Cliente;
import com.residencia.ecommerce.entities.Pedido;
import com.residencia.ecommerce.entities.ProdutosPedido;
import com.residencia.ecommerce.repositories.ClienteRepository;
import com.residencia.ecommerce.repositories.PedidoRepository;
import com.residencia.ecommerce.repositories.ProdutoRepository;
import com.residencia.ecommerce.repositories.ProdutosPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutosPedidoRepository produtosPedidoRepository;

    @Autowired
    private SenderMailService senderMailService;

    //Realiza pedido
    public PedidoDTO pedido(RealizaPedido pedidoRealizado) {

        List<ProdutoPedidoDTO> listaProdutoDto = pedidoRealizado.getListaProdutos();

        //Pedido
        Pedido pedido = new Pedido();
        List<ProdutosPedido> listaProdutos = new ArrayList<>();
        BigDecimal valorTotal = new BigDecimal(0);
        pedidoRepository.save(pedido);
        pedido.setIdPedido(pedido.getIdPedido());
        pedido.setIdCliente(clienteRepository.findById(pedidoRealizado.getIdCliente()).get());
        pedido.setStatus(false);

        for (ProdutoPedidoDTO produtoPedidoDTO : listaProdutoDto) {
            ProdutosPedido produto = new ProdutosPedido();
            produto.setProduto(produtoRepository.getById(produtoPedidoDTO.getIdProduto()));
            produto.setPreco(produtoRepository.getById(produtoPedidoDTO.getIdProduto()).getPreco());
            produto.setQuantidade(produtoPedidoDTO.getQuantidade());
            produto.setPedido(pedido);

            listaProdutos.add(produto);
            valorTotal = valorTotal.add((BigDecimal.valueOf(produto.getQuantidade()).multiply(produto.getPreco())));
        }
        pedido.setValorTotalPedido(valorTotal);
        pedido.setProdutos(listaProdutos);
        pedido.setNumeroPedido(pedido.getIdPedido());
        pedidoRepository.save(pedido);


        //ProdutosPedido
        for (ProdutoPedidoDTO produto : listaProdutoDto) {
            ProdutosPedido produtosPedido = new ProdutosPedido();
            produtosPedido.setProduto(produtoRepository.getById(produto.getIdProduto()));
            produtosPedido.setPedido(pedido);
            produtosPedido.setQuantidade(produto.getQuantidade());
            produtosPedido.setPreco(produtoRepository.getById(produto.getIdProduto()).getPreco());
            produtosPedidoRepository.save(produtosPedido);
        }

        return conversor(pedido, listaProdutoDto);


    }

    //Atualizar pedido
    public PedidoDTO atualizar(AtualizaPedido pedidoAtualizado, Integer id) {

        List<ProdutoPedidoDTO> listaProdutoDto = pedidoAtualizado.getListaProdutos();
        //Pedido
        Pedido pedido = pedidoRepository.getById(id);
        List<ProdutosPedido> listaProdutos = new ArrayList<>();
        BigDecimal valorTotal = new BigDecimal(0);
        pedido.setIdPedido(id);


        List<ProdutosPedido> listaProdutosPedido = pedido.getProdutos();
        for (ProdutosPedido p : listaProdutosPedido) {
            produtosPedidoRepository.delete(p);
        }


        for (ProdutoPedidoDTO produtoPedidoDTO : listaProdutoDto) {
            ProdutosPedido produto = new ProdutosPedido();
            produto.setProduto(produtoRepository.getById(produtoPedidoDTO.getIdProduto()));
            produto.setPreco(produtoRepository.getById(produtoPedidoDTO.getIdProduto()).getPreco());
            produto.setQuantidade(produtoPedidoDTO.getQuantidade());
            produto.setPedido(pedido);

            listaProdutos.add(produto);
            valorTotal = valorTotal.add((BigDecimal.valueOf(produto.getQuantidade()).multiply(produto.getPreco())));
        }
        pedido.setValorTotalPedido(valorTotal);
        pedido.setProdutos(listaProdutos);
        pedido.setNumeroPedido(pedido.getIdPedido());
        pedidoRepository.save(pedido);


        //ProdutosPedido
        for (ProdutoPedidoDTO produto : listaProdutoDto) {
            ProdutosPedido produtosPedido = new ProdutosPedido();
            produtosPedido.setProduto(produtoRepository.getById(produto.getIdProduto()));
            produtosPedido.setPedido(pedido);
            produtosPedido.setQuantidade(produto.getQuantidade());
            produtosPedido.setPreco(produtoRepository.getById(produto.getIdProduto()).getPreco());
            produtosPedidoRepository.save(produtosPedido);
        }
        return conversor(pedido, listaProdutoDto);
    }

    //Vizualizar todos os pedidos
    public List<PedidoDTO> listarTodos() {

        List<PedidoDTO> exibePedidos = new ArrayList<>();
        List<Pedido> pedidos = pedidoRepository.findAll();

        for (Pedido pedido : pedidos) {

            PedidoDTO pedidoDTO = new PedidoDTO();
            List<ProdutosPedido> produtosPedido = pedido.getProdutos();
            List<ExibeProduto> exibeProdutos = new ArrayList<>();

            pedidoDTO.setIdPedido(pedido.getIdPedido());
            pedidoDTO.setNumeroPedido(pedido.getNumeroPedido());
            pedidoDTO.setValorTotal(pedido.getValorTotalPedido());
            pedidoDTO.setDataPedido(pedido.getDataPedido());
            pedidoDTO.setPedidoFinalizado(pedido.getStatus());
            pedidoDTO.setIdCliente(pedido.getIdCliente().getIdCliente());
            pedidoDTO.setTelCLiente(pedido.getIdCliente().getTelefone());
            pedidoDTO.setCpfCliente(pedido.getIdCliente().getCpf());
            pedidoDTO.setNomeCliente(pedido.getIdCliente().getNome());
            pedidoDTO.setEmailCliente(pedido.getIdCliente().getEmail());

            //Produto
            for (ProdutosPedido produtos : produtosPedido) {
                ExibeProduto produto = new ExibeProduto();


                produto.setIdProduto(produtos.getProduto().getIdProduto());
                produto.setQuantidade(produtos.getQuantidade());
                produto.setNomeProduto(produtoRepository.getById(produto.getIdProduto()).getNomeProduto());
                produto.setDescricaoProduto(produtoRepository.getById(produto.getIdProduto()).getDescricao());
                produto.setCategoriaProduto(produtoRepository.getById(produto.getIdProduto()).getIdCategoria().getNomeCategoria());
                produto.setDescricaoCategoria(produtoRepository.getById(produto.getIdProduto()).getIdCategoria().getDescricao());
                produto.setPrecoTotal((produtoRepository.getById(produto.getIdProduto()).getPreco()).multiply(BigDecimal.valueOf(produtos.getQuantidade())));

                exibeProdutos.add(produto);
            }
            pedidoDTO.setListaProdutos(exibeProdutos);
            exibePedidos.add(pedidoDTO);

        }
        return exibePedidos;
    }

    //Finalizar pedido
    public Boolean finalizaPedido (FinalizaPedido status, Integer id){
        Pedido pedido = pedidoRepository.getById(id);
        pedido.setIdPedido(id);
        pedido.setStatus(status.getStatus());
        pedidoRepository.save(pedido);
        Cliente cliente = pedido.getIdCliente();
        List<ProdutosPedido> listaProduto = pedido.getProdutos();
        List<String> listaNomes = new ArrayList<>();
        for (ProdutosPedido p:listaProduto) {
            String nomeProduto = "\nProduto: "+ p.getProduto().getNomeProduto();
            String quantidade ="\nQuantidade: "+ p.getQuantidade().toString();
            listaNomes.add(nomeProduto);
            listaNomes.add(quantidade);
        }
        String mensagem = "Obrigado por comprar conosco! \n O valor total de sua compra foi de R$ "+pedido.getValorTotalPedido() + "\n " +
                "Produtos pedidos: "+listaNomes+" \nSua data de entrega foi prevista em 1 dia útil";
        senderMailService.enviar(cliente.getEmail(),"Pedido Finalizado com sucesso ",mensagem);


        return true;
    }

    //Deletar pedido
    public boolean delete (Integer id) {
        if (id != null) {
            Pedido pedido = pedidoRepository.getById(id);
            List<ProdutosPedido> listaProdutosPedido = pedido.getProdutos();
            for(ProdutosPedido p : listaProdutosPedido){
                produtosPedidoRepository.delete(p);
            }
            pedidoRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }

    }

    //Converte DTO de pedido para DTO de exibição de pedido
    public PedidoDTO conversor(Pedido pedido, List<ProdutoPedidoDTO> listaProdutoDto){
        Cliente cliente = clienteRepository.getById(pedido.getIdCliente().getIdCliente());
        PedidoDTO exibeProduto = new PedidoDTO();
        List<ExibeProduto> listaExibeProduto = new ArrayList<>();

        //Cliente
        exibeProduto.setIdCliente(cliente.getIdCliente());
        exibeProduto.setNomeCliente(cliente.getNome());
        exibeProduto.setEmailCliente(cliente.getEmail());
        exibeProduto.setCpfCliente(cliente.getCpf());
        exibeProduto.setTelCLiente(cliente.getTelefone());
        exibeProduto.setPedidoFinalizado(false);

        //Produto
        for (ProdutoPedidoDTO produtoPedidoDTO : listaProdutoDto){
            ExibeProduto produto = new ExibeProduto();

            produto.setIdProduto(produtoPedidoDTO.getIdProduto());
            produto.setQuantidade(produtoPedidoDTO.getQuantidade());
            produto.setNomeProduto(produtoRepository.getById(produto.getIdProduto()).getNomeProduto());
            produto.setDescricaoProduto(produtoRepository.getById(produto.getIdProduto()).getDescricao());
            produto.setCategoriaProduto(produtoRepository.getById(produto.getIdProduto()).getIdCategoria().getNomeCategoria());
            produto.setDescricaoCategoria(produtoRepository.getById(produto.getIdProduto()).getIdCategoria().getDescricao());
            produto.setPrecoTotal((produtoRepository.getById(produto.getIdProduto()).getPreco()).multiply(BigDecimal.valueOf(produtoPedidoDTO.getQuantidade())));

            listaExibeProduto.add(produto);
        }
        exibeProduto.setListaProdutos(listaExibeProduto);

        //Pedido
        exibeProduto.setIdPedido(pedido.getIdPedido());
        exibeProduto.setNumeroPedido(pedido.getIdPedido());
        exibeProduto.setValorTotal(pedido.getValorTotalPedido());
        exibeProduto.setDataPedido(pedido.getDataPedido());

        return exibeProduto;
    }
































}
