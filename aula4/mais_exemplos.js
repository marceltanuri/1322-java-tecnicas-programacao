const dobrar = (x) => x * 2;
const incrementar = (x) => x + 1;

// Função que compõe duas funções (f depois g)
const comporDuasFuncoes = (f, g) => (x) => f(g(x));

const dobrarDepoisIncrementar = comporDuasFuncoes(incrementar, dobrar);
console.log(dobrarDepoisIncrementar(3)); // (3 * 2) + 1 = 7


const comporVarias = (...fns) => (valorInicial) => 
    fns.reduce((acc, fn) => fn(acc), valorInicial);

const operacao = comporVarias(dobrar, incrementar, Math.sqrt);

console.log(operacao(4)); // (√((4 * 2) + 1)) = √9 = 3

const numeros = [1, 2, 3, 4];


const fn = (acumulador, numero) => acumulador + numero
const somaTotal = numeros.reduce(fn, 0);

console.log(somaTotal); // 10 (1 + 2 + 3 + 4)
