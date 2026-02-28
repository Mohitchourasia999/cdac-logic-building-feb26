#include<stdio.h>

// Celsius → Fahrenheit
float celciusToFahrenheit(float c)
{
    return (c * 9 / 5) + 32;
}

// Fahrenheit → Celsius
float fahrenheitToCelcius(float f)
{
    return (f - 32) * 5 / 9;
}

int main()
{
    float t, t1;

    // input in celcius
    printf("Enter temperature in Celcius: ");
    scanf("%f", &t);

    // input in fahrenheit
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &t1);

    // conversion
    float f = celciusToFahrenheit(t);
    printf("Celcius to Fahrenheit = %.2f\n", f);

    float c = fahrenheitToCelcius(t1);
    printf("Fahrenheit to Celcius = %.2f\n", c);

    return 0;
}