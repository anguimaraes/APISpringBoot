package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

//Especialidade é um enum - ir para o enum dentro do pacote médico para ver as constantes
//DadosEndereco tem muitos dados então será criado um novo record só para ele (endereco é o parametro)
public record DadosCadastroMedico(String nome, String email, String srm, Especialidade especialidade, DadosEndereco endereco) {
}
