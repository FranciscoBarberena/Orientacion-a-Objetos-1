# Ejercicio 11

## Punto 1

```
Gerente alan = new Gerente("Alan Turing");
double aportesDeAlan = alan.aportes();
```
* Se ejecuta `aportes()` de la clase Gerente, que a su vez llama a `montoBasico()` de la clase Gerente.

```
Gerente alan = new Gerente("Alan Turing");
double sueldoBasicoDeAlan = alan.sueldoBasico();
```
* `sueldoBasico()` de `EmpleadoJerarquico`
* `sueldoBasico()` de `Empleado`
* `montoBasico()` de `Gerente`
* `aportes()` de `Gerente`
* `montoBasico()` de `Gerente`
* `bonoPorCategoria()` de `EmpleadoJerarquico`

## Punto 2

`aportesDeAlan = 57000 * 0.05 = 2850`
`sueldoBasicoDeAlan = 57000 + (57000*0.05) + 8000 = 67850`