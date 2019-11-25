package com.example.springbootexperiments.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

    // Inject mock
    @InjectMocks
    SomeCDIBusiness business;

    // create mock
    @Mock
    SomeCDIDAO someCDIDAO;

    @Test
    public void testBasicScenario() {
        when(someCDIDAO.getData()).thenReturn(new int[]{2, 4});
        // when dao.getData() method is called return int[]{2,4}

        assertEquals(4, business.findGreatest());
    }

}
