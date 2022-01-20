package com.renamrgb.crudclient.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renamrgb.crudclient.dto.ClientDTO;
import com.renamrgb.crudclient.entities.Client;
import com.renamrgb.crudclient.repositories.ClientRepository;
import com.renamrgb.crudclient.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		Page<Client> list = repository.findAll(pageRequest);
		
		return list.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Recurso não existe"));
		return new ClientDTO(entity);
		
	}
}
