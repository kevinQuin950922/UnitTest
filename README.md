# Parte práctica pruebas unitarias

## Introducción

El objetivo de este proyecto es afianzar los conocimientos adquiridos en la presentación teórica de pruebas unitarias

## 1. Clonar proyecto
Se abre una terminal de sistema y buscamos el lugar donde vamos a guardar el proyecto
Clonamos el proyecto mediante la siguiente línea de comandos
```jsx
git clone https://github.com/kevinQuin950922/UnitTest.git
```
##  2. Configuración de las pruebas unitarias

Para esta parte práctica se va a realizar pruebas sobre la clase GiroServicioImpl

Se crea los paquetes servicio.impl en la ruta src/test/java/co.com.devco.serviciobase
Se crea la clase con el nombre GiroServicioImplTest

Primero importamos las dependecias necesarias para realizar las pruebas
```jsx
import co.com.devco.serviciobase.fachada.GiroFachada;
import co.com.devco.serviciobase.modelo.Transaccion;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;
``
Dentro de la clase se inicializa los mocks que vayamos a usar, por tanto se agrega
```jsx
@BeforeEach
public void setUp() {
   MockitoAnnotations.initMocks(this);
}
```
Se define el primer método de prueba. En este caso se va a probar el método “consultarGiro”
```jsx
@Test
public void testConsultarGiroCuandoSeIngresaLosCamposCorrectamenteEntoncesDebeCosultarGiro() {}
```
Dentro de las llaves se define las condiciones iniciales de nuestra prueba
```jsx
// arrange
GiroFachada giroFachada = mock(GiroFachada.class);
Transaccion transaccionmock = mock(Transaccion.class);
String idTransaccionTest = "testTransaccion";
String fechaInicioTest = "testFechaInicio";
String fechaFinTest = "testFechafinal";
GiroServicioImpl giroServicio= new GiroServicioImpl(giroFachada);
when(giroFachada.consultarGiro()).thenReturn(transaccionmock);
```
Aplicamos el acto, esto quiere decir llamamos el método que queremos probar
```jsx
//act
Transaccion transaccionCapture = giroServicio.consultarGiro(idTransaccionTest, fechaInicioTest, fechaFinTest);
```
Validamos que las respuesta sean las que estamos esperando
```jsx
verify(giroFachada).consultarGiro();
assertEquals(transaccionmock,transaccionCapture);
```
Ahora se va a probar el metodo “ValidarIdTransaccion”. Definimos el arrange, act y assert
```jsx
@Test
public void testValidarIdTransaccionCuandoElIdtransaccionIngresaVacioEntoncesSeDebeCapturarUnaExcepcion(){
   // arrange
   GiroFachada giroFachada = mock(GiroFachada.class);
   String idTransaccionTest = "";
   String mensajeEsperado="Id de transaccion invalida";
   GiroServicioImpl giroServicio = new GiroServicioImpl(giroFachada);
   // act
   Exception exception = assertThrows(RuntimeException.class,()-> giroServicio.validarIdTransaccion(idTransaccionTest));
   String mensajeCapturado = exception.getMessage();
   // assert
   assertEquals(mensajeCapturado,mensajeEsperado);
}
```
## 3. Configuración Jacoco

Para poder visualizar la cobertura de código se debe configurar el archivo build.gradle agregando las siguientes líneas.
```jsx
apply plugin: 'jacoco'

jacoco {
	toolVersion = "0.8.5" //jacoco version
	reportsDirectory = layout.buildDirectory.dir('customJacocoReportDir')
}

test {
	finalizedBy jacocoTestReport // report is always generated after tests run
}
jacocoTestReport {
	dependsOn test // tests are required to run before generating the report
	reports {
		xml.required = false
		csv.required = false
		html.outputLocation = layout.buildDirectory.dir('jacocoHtml')
	}
}
```
Se vuelve a contruir el proyecto y se ejecutan las pruebas
