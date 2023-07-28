package io.swagger.api;

import io.swagger.model.LoanOffersRequest;
import io.swagger.model.LoanOffersResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-28T12:14:55.430793391Z[GMT]")
@RestController
public class GetLoanOffersApiController implements GetLoanOffersApi {

    private static final Logger log = LoggerFactory.getLogger(GetLoanOffersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetLoanOffersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<LoanOffersResponse> getLoanOffersPost(@Parameter(in = ParameterIn.DEFAULT, description = "Check customer eligibility and get loan offers", schema=@Schema()) @Valid @RequestBody LoanOffersRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LoanOffersResponse>(objectMapper.readValue("{\n  \"merchantRef\" : \"ZYXGHJ74590TYU\",\n  \"loanOffers\" : [ {\n    \"instalmentAmount\" : 6.027456183070403,\n    \"offerId\" : \"offerId\",\n    \"loanTensure\" : 0,\n    \"currency\" : \"GBP\"\n  }, {\n    \"instalmentAmount\" : 6.027456183070403,\n    \"offerId\" : \"offerId\",\n    \"loanTensure\" : 0,\n    \"currency\" : \"GBP\"\n  } ],\n  \"customerEligibility\" : \"eligible\",\n  \"bankRef\" : \"PODFZABC45XERTY\"\n}", LoanOffersResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LoanOffersResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LoanOffersResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
