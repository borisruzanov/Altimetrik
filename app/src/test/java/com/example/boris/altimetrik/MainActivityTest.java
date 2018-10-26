package com.example.boris.altimetrik;

import com.example.boris.altimetrik.Models.Example;
import com.example.boris.altimetrik.Models.Proposal;
import com.example.boris.altimetrik.network.ApiService;
import com.example.boris.altimetrik.network.RetrofitClient;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.Robolectric;
import org.robolectric.util.ActivityController;

import java.io.IOException;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static retrofit2.Response.success;

public class MainActivityTest {

    private MainActivity activity;

    @Mock
    private ApiService mockApi;

    @Captor
    private ArgumentCaptor<Callback<List<Example>>> cb;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);
        activity = controller.get();
//        activity.listAdapter(mockApi);

        controller.create();
    }

    @Test
    public void shouldFillAdapterWithReposFromApi() throws Exception {
        Mockito.verify(mockApi).loadData("");

        List<Example> testRepos = new ArrayList<Example>();

        cb.getValue().onResponse((Call<List<Example>>) testRepos, null);

//        assertThat(activity.getlistAdapter()).hasCount(2);
    }
}