package com.zheye;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: 云萧YYY
 * @DateTime: 2022/04/05
 * @Description: TODO 冒烟测试
 */
@AutoConfigureMockMvc
@SpringBootTest
public class SmackTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * 健康检查
     */
    @Test
    void should_mock_mvc_endpoint_health() throws Exception {

        mockMvc.
                perform(MockMvcRequestBuilders.get("/actuator/health"))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$.status").value("UP"))
        ;


    }


}
