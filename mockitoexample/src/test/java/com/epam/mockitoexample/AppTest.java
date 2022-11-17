package com.epam.mockitoexample;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * Unit test for simple App.
 */

@RunWith(MockitoJUnitRunner.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	private static StudentFunctions student;
	private static Student stud1;
	private static Student stud2;
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	
    	
    	//when(stud1.isPaid()).thenReturn(false);
        assertTrue( true );
    }
}
