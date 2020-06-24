package org.wecancodeit.reviews.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.wecancodeit.reviews.entities.Category;
import org.wecancodeit.reviews.storage.CategoryStorage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CategoryControllerTest {
    @Test
    public void showSingleCategoryItShouldReturnViewName(){
        CategoryStorage mockStorage = mock(CategoryStorage.class);
        CategoryController underTest = new CategoryController(mockStorage);
        Model mockModel = mock(Model.class);
        String viewName = underTest.showSingleCategory("", mockModel);
        assertEquals("category-template", viewName);
    }

    @Test
    public void showSingleCategoryItShouldModelCorrectAttribute() {
        CategoryStorage mockStorage = mock(CategoryStorage.class);
        Category testCategory = new Category("test");
        when(mockStorage.findCategoryByName("test")).thenReturn(testCategory);
        CategoryController underTest = new CategoryController(mockStorage);
        Model mockModel = mock(Model.class);
        underTest.showSingleCategory("test", mockModel);
        verify(mockModel).addAttribute("category", testCategory);
        verify(mockStorage).findCategoryByName("test");
    }




    }
