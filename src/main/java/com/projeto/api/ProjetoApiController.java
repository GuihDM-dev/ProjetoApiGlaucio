package com.projeto.api;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/")

public class ProjetoApiController {
	
	@GetMapping("/")
    public String hello(){
        return "hello";
    }
	
	@GetMapping("/produto")
    public String produto(){
        return "produto";
    }
	
	@GetMapping("/pedido")
    public String pedido(){
        return "pedido";
    }
	@GetMapping("/pagamento")
    public String pagamento(){
        return "pagamento";
    }
	@GetMapping("/carrinho")
    public String carrinho(){
        return "carrinho";
    }
	@GetMapping("/usuario")
    public String usuario(){
        return "usuario";
    }
	
	
	
}

