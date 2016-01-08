package com.example.iem.testunitaire;

import android.content.Context;
import android.content.SharedPreferences;

import junit.framework.TestCase;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

/**
 * Created by iem on 03/12/15.
 */
public class StorageTest extends TestCase {
    Storage storage;
    @Mock
    Context context;
    @Mock
    SharedPreferences sharedPreferences;
    @Mock
    SharedPreferences.Editor editor;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);


        doReturn(sharedPreferences).when(context).getSharedPreferences(anyString(), anyInt());


        doReturn(editor).when(sharedPreferences).edit();


        doReturn(editor).when(editor).putString(anyString(), anyString());
        storage=new Storage(null);

    }

    public void testTransformToString() throws Exception {
        List<Integer> integers= Arrays.asList(1,2,3);
        String string=storage.transformToString(integers);
        assertEquals("1,2,3",string);
    }

    public void testTransformFromString() throws Exception {
        String string = "1,2,3";

        List<Integer> integers = storage.transformFromString(string);

        assertEquals(Arrays.asList(1, 2, 3),integers);
    }

    public void testLoad() throws Exception {
        doReturn("1,2,3").when(sharedPreferences).getString(anyString(),isNull(String.class));

        List<Integer> integers = storage.load();

        verify(sharedPreferences, atLeastOnce()).getString(anyString(),isNull(String.class));
        assertEquals(Arrays.asList(1, 2, 3), integers);
    }

    public void testSave() throws Exception {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        storage.save(integers);

        verify(editor, atLeastOnce()).putString(anyString(),eq("1,2,3"));
        verify(editor, atLeastOnce()).apply();
    }
}