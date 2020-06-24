package org.wecancodeit.reviews.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.reviews.entities.Category;
import org.wecancodeit.reviews.storage.CategoryStorage;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebMvcTest

public class WebMVCLayerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void shouldReceiveOKFromCategoryEndpoint() throws Exception {
        CategoryStorage mockStorage = mock(CategoryStorage.class);
        Category testCategory = new Category("SUV");
        when(mockStorage.findCategoryByName("SUV")).thenReturn(testCategory);
        mockMvc.perform(get("categories/SUV"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("category", "SUV"))
                .andExpect(view().name("category-template"));
        verify(mockStorage).findCategoryByName("SUV");
    }
}