package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController é para o spring carregar a classe
@RestController

//passando o URL desse controller para a spring
@RequestMapping("medicos")
public class MedicoController {

    //@PostMapping é qual requisição http o metodo vai fazer
    //@RequestBody indica que o spring vai pegar os dados de json no corpo da requisição(escrito direto no postman)
    //em DadosCadastroMedico eu recebo nesse parametro os meus record criados
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        //exibe no run do intellj
        System.out.println(dados);

    }

}
