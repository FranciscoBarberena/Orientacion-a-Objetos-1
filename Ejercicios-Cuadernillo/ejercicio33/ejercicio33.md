# Ejercicio 33 (tipadOOs)

## Inciso 1

* `A objeto = new C()`
    * `objeto.mensajeInterface()`
* `A objeto = new E()`
    * `objeto.mensajeInterface()`

## Inciso 2

* `B objeto = new C()`
    * `objeto.mensajeAbstracto()`
* `B objeto = new D()`
    * `objeto.mensajeAbstracto()`
* `B objeto = new E()`
    * `objeto.mensajeAbstracto()`
    * Al no tener implementación del método, estaría llamando al método de D.

## Inciso 3

* `D objeto =  new D();`
    * `objeto.mensajeAbstracto()`
    * `objeto.mensajeParticular()`
* `D objeto =  new E();`
    * `objeto.mensajeAbstracto()`
    * `objeto.mensajeParticular();`

## Inciso 4

* `C objeto = new C();`
   * `objeto.mensajeAbstracto()`
   * `objeto.mensajeInterface()`

## Inciso 5
* `C objeto = new C();`
    * `objeto.mensajeAbstracto();`
* `B objeto = new C();`
    * `objeto.mensajeAbstracto();`

## Inciso 6
* `C objeto = new C();`
    * `objeto.mensajeInterface();`
* `A objeto = new C()`
    * `objeto.mensajeInterface();`


