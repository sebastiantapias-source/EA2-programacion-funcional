import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorDatos {
    // Función pura: sin efectos secundarios
    public static int calcularSuma(List<Integer> numeros) {
        return numeros.stream()
                      .mapToInt(Integer::intValue)
                      .sum();
    }

    public static void main(String[] args) {
        List<Integer> datos = Arrays.asList(12, 45, 7, 23, 56, 89, 31);

        // Lambda + filtrado con stream
        List<Integer> mayoresA20 = datos.stream()
                .filter(num -> num > 20)
                .collect(Collectors.toList());

        // Transformación con stream
        List<Integer> duplicados = mayoresA20.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Datos originales: " + datos);
        System.out.println("Números mayores a 20: " + mayoresA20);
        System.out.println("Valores duplicados: " + duplicados);
        System.out.println("Suma total de datos: " + calcularSuma(datos));
    }
}