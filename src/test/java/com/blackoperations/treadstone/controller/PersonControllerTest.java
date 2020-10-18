package com.blackoperations.treadstone.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class PersonControllerTest {

    @Autowired
    private PersonController personController;

    private MockMvc mockMvc;

    @Test
    void getPerson() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
        mockMvc.perform(
                get("/api/person/1"))
                .andDo(print())
                .andExpect(status().isOk()
        );
    }


    @Test
    void postPerson() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
        mockMvc.perform(
                post("/api/person")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\": \"martin2\", \"age\": 20, \"bloodType\": \"A\"}"))
                .andDo(print())
//                .andExpect(status().isOk()
                .andExpect(status().isCreated()
        );
    }

    @Test
    void modifyPerson() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
        mockMvc.perform(
                put("/api/person/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\": \"martin\", \"age\": 20, \"bloodType\": \"A\"}"))
                .andDo(print())
                .andExpect(status().isOk()
        );
    }

    @Test
    void modifyPersonName() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
        mockMvc.perform(
                patch("/api/person/1")
                        .param("name", "martin2"))
                .andDo(print())
                .andExpect(status().isOk()
        );
    }
}