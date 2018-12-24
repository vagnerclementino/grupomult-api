package br.com.grupomult.flowdefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.flows.carros.AdicionaCarroResponse;
import br.com.grupomult.flows.carros.AdicionaCarrosConverter;
import br.com.grupomult.flows.carros.AdicionaCarrosLoad;
import br.com.grupomult.flows.carros.AdicionaCarrosValidate;
import br.com.grupomult.flows.carros.AtualizaCarroResponse;
import br.com.grupomult.flows.carros.AtualizaCarrosConverter;
import br.com.grupomult.flows.carros.AtualizaCarrosLoad;
import br.com.grupomult.flows.carros.AtualizaCarrosValidate;
import br.com.grupomult.flows.carros.ListCarrosByIdConverter;
import br.com.grupomult.flows.carros.ListCarrosByIdLoad;
import br.com.grupomult.flows.carros.ListCarrosByIdLoadValidate;
import br.com.grupomult.flows.carros.ListCarrosByIdResponse;
import br.com.grupomult.flows.carros.ListCarrosByIdValidate;
import br.com.grupomult.flows.carros.ListCarrosConverter;
import br.com.grupomult.flows.carros.ListCarrosLoad;
import br.com.grupomult.flows.carros.ListCarrosResponse;
import br.com.grupomult.flows.carros.ListCarrosValidate;
import br.com.grupomult.flows.carros.RemoveCarrosConverter;
import br.com.grupomult.flows.carros.RemoveCarrosLoad;
import br.com.grupomult.flows.carros.RemoveCarrosResponse;
import br.com.grupomult.flows.carros.RemoveCarrosValidate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class FlowDefinitionTest {

	@Autowired
	private ApplicationContext applicationContest;

	@Test
	public void testFlowListCarrosExistsSuccess() {
		assertNotNull(applicationContest.getBean("listCarrosValidate"));
		assertNotNull(applicationContest.getBean("listCarrosLoad"));
		assertNotNull(applicationContest.getBean("listCarrosConverter"));
		assertNotNull(applicationContest.getBean("listCarrosResponse"));
	}

	@Test
	public void testFlowListCarrosInstanceofSuccess() {
		assertTrue(applicationContest.getBean("listCarrosValidate") instanceof ListCarrosValidate);
		assertTrue(applicationContest.getBean("listCarrosLoad") instanceof ListCarrosLoad);
		assertTrue(applicationContest.getBean("listCarrosConverter") instanceof ListCarrosConverter);
		assertTrue(applicationContest.getBean("listCarrosResponse") instanceof ListCarrosResponse);
	}

	@Test
	public void testFlowListCarrosByIdExistsSuccess() {
		assertNotNull(applicationContest.getBean("listCarrosByIdValidate"));
		assertNotNull(applicationContest.getBean("listCarrosByIdLoad"));
		assertNotNull(applicationContest.getBean("listCarrosByIdLoadValidate"));
		assertNotNull(applicationContest.getBean("listCarrosByIdConverter"));
		assertNotNull(applicationContest.getBean("listCarrosByIdResponse"));
	}

	@Test
	public void testFlowListCarrosByIdInstanceofSuccess() {
		assertTrue(applicationContest.getBean("listCarrosByIdValidate") instanceof ListCarrosByIdValidate);
		assertTrue(applicationContest.getBean("listCarrosByIdLoad") instanceof ListCarrosByIdLoad);
		assertTrue(applicationContest.getBean("listCarrosByIdLoadValidate") instanceof ListCarrosByIdLoadValidate);
		assertTrue(applicationContest.getBean("listCarrosByIdConverter") instanceof ListCarrosByIdConverter);
		assertTrue(applicationContest.getBean("listCarrosByIdResponse") instanceof ListCarrosByIdResponse);
	}
	
	@Test
	public void testFlowAdicionaCarrosExistsSuccess() {
		assertNotNull(applicationContest.getBean("adicionaCarrosValidate"));
		assertNotNull(applicationContest.getBean("adicionaCarrosLoad"));
		assertNotNull(applicationContest.getBean("adicionaCarrosConverter"));
		assertNotNull(applicationContest.getBean("adicionaCarroResponse"));
	}

	@Test
	public void testFlowAdicionaCarrosInstanceofSuccess() {
		assertTrue(applicationContest.getBean("adicionaCarrosValidate") instanceof AdicionaCarrosValidate);
		assertTrue(applicationContest.getBean("adicionaCarrosLoad") instanceof AdicionaCarrosLoad);
		assertTrue(applicationContest.getBean("adicionaCarrosConverter") instanceof AdicionaCarrosConverter);
		assertTrue(applicationContest.getBean("adicionaCarroResponse") instanceof AdicionaCarroResponse);
	}
	
	public void testFlowAtualizaCarrosExistsSuccess() {
		assertNotNull(applicationContest.getBean("atualizaCarrosValidate"));
		assertNotNull(applicationContest.getBean("atualizaCarrosLoad"));
		assertNotNull(applicationContest.getBean("atualizaCarrosConverter"));
		assertNotNull(applicationContest.getBean("atualizaCarroResponse"));
	}

	@Test
	public void testFlowAtualizaCarrosInstanceofSuccess() {
		assertTrue(applicationContest.getBean("atualizaCarrosValidate") instanceof AtualizaCarrosValidate);
		assertTrue(applicationContest.getBean("atualizaCarrosLoad") instanceof AtualizaCarrosLoad);
		assertTrue(applicationContest.getBean("atualizaCarrosConverter") instanceof AtualizaCarrosConverter);
		assertTrue(applicationContest.getBean("atualizaCarroResponse") instanceof AtualizaCarroResponse);
	}

	public void testFlowRemoveCarrosExistsSuccess() {
		assertNotNull(applicationContest.getBean("removeCarrosValidate"));
		assertNotNull(applicationContest.getBean("removeCarrosLoad"));
		assertNotNull(applicationContest.getBean("removeCarrosConverter"));
		assertNotNull(applicationContest.getBean("removeCarroResponse"));
	}

	@Test
	public void testFlowRemoveCarrosInstanceofSuccess() {
		assertTrue(applicationContest.getBean("removeCarrosValidate") instanceof RemoveCarrosValidate);
		assertTrue(applicationContest.getBean("removeCarrosLoad") instanceof RemoveCarrosLoad);
		assertTrue(applicationContest.getBean("removeCarrosConverter") instanceof RemoveCarrosConverter);
		assertTrue(applicationContest.getBean("removeCarroResponse") instanceof RemoveCarrosResponse);
	}
}
