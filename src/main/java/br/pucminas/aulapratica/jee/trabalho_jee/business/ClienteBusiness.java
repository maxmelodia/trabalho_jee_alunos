package br.pucminas.aulapratica.jee.trabalho_jee.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.pucminas.aulapratica.jee.trabalho_jee.entity.ClienteEntity;
import br.pucminas.aulapratica.jee.trabalho_jee.repository.ClienteRepository;
import br.pucminas.aulapratica.jee.trabalho_jee.resource.ClienteResource;

@Stateless
public class ClienteBusiness {

	@Inject
	private ClienteRepository repo;
	public void salvarCliente(ClienteResource clienteResource){
		/*Implementação da lógica de salvar um cliente*/
		ClienteEntity clienteEntity = new ClienteEntity();
		toEntity(clienteResource, clienteEntity);
		repo.salvar(clienteEntity);
	}
	
	private void toEntity(ClienteResource resource, ClienteEntity entity){
		entity.setNome(resource.getNome());
		entity.setCpf(resource.getCpf());
		entity.setEmail(resource.getEmail());
		entity.setDataNascimento(resource.getDataNascimento());
	}
	
	/* Implementação da listagem de clientes conforme desafio 2 */
	
}
