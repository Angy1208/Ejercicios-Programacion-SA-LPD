function generarSerieFibonacci() {
    let numero;
    do {
        numero = parseInt(prompt("Ingrese un número entero positivo:"));
        if (isNaN(numero) || numero < 0) {
            alert("Por favor, ingrese un número entero positivo.");
        }
    } while (isNaN(numero) || numero < 0);

    const serieFibonacci = calcularSerieFibonacci(numero);

    alert(`La serie de Fibonacci con ${numero} números es: ${serieFibonacci.join(", ")}`);
}

function calcularSerieFibonacci(n) {
    const serieFibonacci = [0, 1];
    for (let i = 2; i < n; i++) {
        serieFibonacci.push(serieFibonacci[i - 1] + serieFibonacci[i - 2]);
    }
    return serieFibonacci;
}