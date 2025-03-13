// function somar(n1, n2){
//     return n1 + n2;
// }

const somar = (n1, n2) => n1 + n2;

// function multiplicar(n1, n2){
//     return n1 * n2;
// }

const multiplicar = (n1, n2) => n1 * n2;

// function compor(f1, f2){
//     return function(a,b,c){
//         return f1(f2(a, b), c)
//     }
// }

const compor = (f1, f2) => (a,b,c) => f1(f2(a,b),c);

var somarDepoisMultiplicar = compor(multiplicar, somar);

console.log(somar(2,3));
console.log(multiplicar(2,3));
console.log(somarDepoisMultiplicar(2,3,4))

// listas

// filtrar dados em uma lista por condicoes especificas
// ordenar dados em uma lista em uma condição especifica

// com lambda functions essas operação serão muito simples de implementar