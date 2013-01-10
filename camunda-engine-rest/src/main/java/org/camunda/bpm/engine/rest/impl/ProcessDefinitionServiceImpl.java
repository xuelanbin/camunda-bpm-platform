package org.camunda.bpm.engine.rest.impl;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.camunda.bpm.engine.rest.ProcessDefinitionService;
import org.camunda.bpm.engine.rest.dto.ProcessDefinitionDto;
import org.camunda.bpm.engine.rest.exception.InvalidRequestException;

public class ProcessDefinitionServiceImpl extends AbstractEngineService implements ProcessDefinitionService {

  public ProcessDefinitionServiceImpl() {
    super();
  }
  
	@Override
	public List<ProcessDefinitionDto> getProcessDefinitions(String processDefinitionKeyFragment) {
	  if (processDefinitionKeyFragment == null) {
	    throw new InvalidRequestException("The query misses a processDefinitionKey.");
	  }
	  
	  List<ProcessDefinitionDto> definitions = new ArrayList<ProcessDefinitionDto>();
	  
	  RepositoryService repoService = processEngine.getRepositoryService();
    ProcessDefinitionQuery query = repoService.createProcessDefinitionQuery().processDefinitionKeyLike(processDefinitionKeyFragment);
	  
	  List<ProcessDefinition> matchingDefinitions = query.list();
	  
	  for (ProcessDefinition definition : matchingDefinitions) {
	    ProcessDefinitionDto def = ProcessDefinitionDto.fromProcessDefinition(definition);
	    definitions.add(def);
	  }
	  return definitions;
	}

}