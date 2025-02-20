import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import hypergeom

# Parámetros del problema
N = 100  # Total de boletos
K = 40   # Boletos para la película de acción
n = 10   # Personas seleccionadas

# Rango de valores para la variable aleatoria (número de éxitos)
x = np.arange(0, n+1)  # Desde 0 hasta n (pueden salir de 0 a 10 personas con boletos de acción)

# Función de probabilidad
probabilidades = hypergeom.pmf(x, N, K, n)

# Graficar
plt.bar(x, probabilidades, color='skyblue', edgecolor='black')
plt.xlabel("Número de personas con boletos de acción")
plt.ylabel("Probabilidad")
plt.title("Distribución Hipergeométrica: Festival de Cine")
plt.xticks(x)
plt.grid(axis='y', linestyle='--', alpha=0.7)

# Mostrar gráfica
plt.show()
