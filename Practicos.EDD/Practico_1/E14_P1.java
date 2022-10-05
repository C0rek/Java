package Practico_1;

// El CUIT/CUIL consta de 11 números. Los 10 primeros (2 + 8) constituyen el código de identificación y el último, el dígito de verificación. 
// Para obtener esta verificación se procede de la siguiente forma: A cada dígito del código, se lo multiplica por los siguientes números (respectivamente) 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 y cada valor obtenido, se suma  para obtener una expresión (que llamaremos "valor 1". A  este "valor 1", se le saca el resto de la división  entera a 11. Se obtiene de esta forma un número (del 0 al 
// 10) (que llamamos "valor 2"). Sacamos la diferencia entre 11 y el "valor 2", y obtenemos un valor comprendido entre 1  y 11 (llamémosle "valor 3"). Si "valor 3"=11, el código verificador es cero. Si "valor 3"=10, el código verificadores 9. En cualquier otro caso, el código verificador es "valor 3". 
//
// Ejemplo numérico con un número de CUIT, que es 20-17254359-7. 
//
// 2 0 1 7 2 5 4 3 5 9 
// x 
// 5 4 3 2 7 6 5 4 3 2 
// ------------------------------------------------ 
// 10 + 00 + 03 + 14 + 14 + 30 + 20 + 12 + 15 + 18 = 136 
// v1 = 136 
// 136 mod 11 = 4 
// v2 = 4 
// 11 - 4 = 7 
// v3 = 7 => Código de verificación es siete. 
//
// Aplicando Arrays, diseñe una solución en Java para determinar el código de verificación a partir del ingreso de los 10 primeros dígitos del CUIT/CUIL. 

public class E14_P1 {
    
}
