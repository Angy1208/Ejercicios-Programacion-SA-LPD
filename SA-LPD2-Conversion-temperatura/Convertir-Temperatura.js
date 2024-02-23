function convertirTemperatura() {
    let temperaturaCelsius;
    do {
        temperaturaCelsius = parseFloat(prompt("Ingrese la temperatura en grados Celsius:"));
        if (isNaN(temperaturaCelsius)) {
            alert("Por favor, ingrese un número válido.");
        }
    } while (isNaN(temperaturaCelsius));

    const temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
    const temperaturaKelvin = temperaturaCelsius + 273.15;

    alert(`Grados Kelvin: ${temperaturaKelvin}\nGrados Fahrenheit: ${temperaturaFahrenheit}`);
}