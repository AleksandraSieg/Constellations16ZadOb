package pl.madison.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.madison.dao.ConstellationDao;
import pl.madison.domain.Constellation;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestControllerTest {

    @InjectMocks
    private TestController testController;

    @Mock
    private ConstellationDao constellationDao;

    private MockMvc mockMvc;
    @Before
    public void init(){

        mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
//        mockMvc.m


    }

    @Test
    public void show() throws Exception {
        //given, when, then
    }

    @Test
    public void newOrder() throws Exception {
    }

    @Test
    public void update() throws Exception {


//        List<Constellation> constellationLst = Arrays.asList(Constellation.builder().id(2L).name("we").surfaceInDegrees("3").surfaceInDegrees("123").build());
        Mockito.when(constellationDao.findOne(2L)).thenReturn(Constellation.builder().id(2L).name("we").surfaceInDegrees("3").surfaceInDegrees("123").build());
        //given
        mockMvc.perform(MockMvcRequestBuilders.put("/update")
                .param("id", "2").param("surfaceInDegrees", "tyu")
                        .param("name", "123")
                        .param("theBrighestStar", "Rigel")).
                        andExpect(MockMvcResultMatchers.content().string("mission has been completed:)"));
        //when

        //then

    }

    @Test
    public void add() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}