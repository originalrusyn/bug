package com.bug.a.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nullable;

@RestController
class CApiController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * This operation searches S by date range. It returns only brief information about S.
     */
    @GetMapping("/group-classes/v1.0/classes")
    @Nullable Iterable<Object> searchClasses(@ModelAttribute @Validated(String.class) SearchClassesRequest searchClassesRequest) {
        return null;
    }

}
