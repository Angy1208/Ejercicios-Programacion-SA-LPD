function calcularFactorial() {
    let numero;
    do {
        numero = parseInt(prompt("Ingrese un número entero positivo:"));
        if (isNaN(numero) || numero < 0) {
            alert("Por favor, ingrese un número entero positivo.");
        }
    } while (isNaN(numero) || numero < 0);

    const factorial = calcularFactorialRecursivo(numero);

    alert(`El factorial de ${numero} es: ${factorial}`);
}

function calcularFactorialRecursivo(n) {
    if (n === 0 || n === 1) {
        return 1;
    } else {
        return n * calcularFactorialRecursivo(n - 1);
    }
}