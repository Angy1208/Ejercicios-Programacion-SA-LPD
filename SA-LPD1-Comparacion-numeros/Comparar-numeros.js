function ordenarNumeros() {
    const num1 = parseInt(prompt("Ingrese el primer número:"));
    const num2 = parseInt(prompt("Ingrese el segundo número:"));
    const num3 = parseInt(prompt("Ingrese el tercer número:"));

    let mayor, centro, menor;
    if (num1 >= num2 && num1 >= num3) {
        mayor = num1;
        centro = num2 >= num3 ? num2 : num3;
        menor = num2 >= num3 ? num3 : num2;
    } else if (num2 >= num1 && num2 >= num3) {
        mayor = num2;
        centro = num1 >= num3 ? num1 : num3;
        menor = num1 >= num3 ? num3 : num1;
    } else {
        mayor = num3;
        centro = num1 >= num2 ? num1 : num2;
        menor = num1 >= num2 ? num2 : num1;
    }

    alert(`Ordenados de mayor a menor: ${mayor}, ${centro}, ${menor}\nOrdenados de menor a mayor: ${menor}, ${centro}, ${mayor}\n${num1 === num2 && num1 === num3 ? "Los números son iguales." : "Los números no son iguales."}`);
}