package org.eclipse.digitaltwin.basyx.aasregistry.service.api;

import org.eclipse.digitaltwin.basyx.aasregistry.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.basyx.aasregistry.model.AssetKind;
import org.eclipse.digitaltwin.basyx.aasregistry.model.GetAssetAdministrationShellDescriptorsResult;
import org.eclipse.digitaltwin.basyx.aasregistry.model.GetSubmodelDescriptorsResult;
import org.eclipse.digitaltwin.basyx.aasregistry.model.Result;
import org.eclipse.digitaltwin.basyx.aasregistry.model.SubmodelDescriptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T10:50:35.975734200+01:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.dotAASPart2HTTPRESTAssetAdministrationShellRegistryServiceSpecification.base-path:}")
public class ShellDescriptorsApiController implements ShellDescriptorsApi {

    private final ShellDescriptorsApiDelegate delegate;

    public ShellDescriptorsApiController(@Autowired(required = false) ShellDescriptorsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ShellDescriptorsApiDelegate() {});
    }

    @Override
    public ShellDescriptorsApiDelegate getDelegate() {
        return delegate;
    }

}