package com.bug.a;


import com.bug.b.AuthTokenInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nullable;

@RestController
class ApiController {

    /**
     * This operation returns all detailed information about S.
     * @param authTokenInfo This header contains S in system.
     * @param supplierId This header contains User ID in S. Required for every canonical operation which supports API access restriction on User level.
     * @param exerciserId Unique ID which is returned by API and/or by  API
     * @param classId Unique ID
     */
    @GetMapping("/group-classes/v1.0/classes/{classId}")
    @Nullable String search(@PathVariable long classId,
                            @RequestHeader("GG") int supplierId,
                            @RequestHeader("FF") int exerciserId,
                            @RequestHeader("RR") AuthTokenInfo authTokenInfo) {

        return null;
    }

}
