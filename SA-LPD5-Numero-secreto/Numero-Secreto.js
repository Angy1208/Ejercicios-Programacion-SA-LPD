function adivinarNumeroSecreto() {
    const numeroSecreto = generarNumeroSecreto();
    const numerosIntentados = [];

    let intento;
    do {
        intento = parseInt(prompt("Intenta adivinar el número secreto (del 1 al 100):"));
        if (isNaN(intento) || intento < 1 || intento > 100) {
            alert("Por favor, ingrese un número válido (del 1 al 100).");
        } else {
            numerosIntentados.push(intento);
            if (intento < numeroSecreto) {
                alert("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                alert("El número secreto es menor.");
            }
        }
    } while (intento !== numeroSecreto);

    alert(`Felicidades, adivinaste el número secreto.\nLista de números introducidos: ${numerosIntentados.join(", ")}`);
}

function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
}