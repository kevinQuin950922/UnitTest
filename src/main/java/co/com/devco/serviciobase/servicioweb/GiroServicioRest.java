package co.com.devco.serviciobase.servicioweb;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.devco.serviciobase.servicioweb.recurso.TransaccionRecurso;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@Path("/v1")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface GiroServicioRest {

    @GET
    @Path("/consultar/giro")
    @Operation(summary = "", description = "", responses = {
            @ApiResponse(content = @Content(schema = @Schema(implementation = TransaccionRecurso.class)), responseCode = "201", description = "Respuesta exitosa", headers = {
                    @Header(name = HttpHeaders.CONTENT_TYPE, description = "", schema = @Schema(implementation = String.class)),
                    @Header(name = HttpHeaders.CONTENT_LANGUAGE, description = "", schema = @Schema(implementation = String.class)),
                    @Header(name = "", description = "", schema = @Schema(implementation = String.class)),
                    @Header(name = "", description = "", schema = @Schema(implementation = String.class))})
    })
    Response consultarGiro(
            @Parameter(description = "identificador de la transaccion") @QueryParam("idTransaccion") String idTransaccion,
            @Parameter(description = "fecha inicio de consulta") @QueryParam("fechaInicio") String fechaInicio,
            @Parameter(description = "fecha fin de consulta") @QueryParam("fechaFin") String fechaFin
    ) throws Exception;
}
